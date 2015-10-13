package integrador.soap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import integrador.rest.Transacao;

/**
 * 
 * @author Lyndon Tavares
 *
 */
public class ContaDAO {

	List<Conta> contas;

	public ContaDAO() {
		contas = new ArrayList<Conta>();
		contas.add(new Conta(1, "Lyndon", 1000));
		contas.add(new Conta(2, "Joni", 1000));
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public double consultarSaldo(long num) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == num) {
				return c.getSaldo();
			}
		}
		return 0;
	}

	public Conta getConta(long num) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == num) {
     			return c;
			}
		}
		return new Conta();
	}

	public Conta criarConta(Conta conta) {
		conta.setNumeroConta(contas.size() + 1);
		contas.add(conta);

		//LOG DE TRANSACAO
		//gerarLog(conta, 0, BancarioServiceLogTipoTransacao.CRIACAO.toString());
		

		return conta;
	}

	public String fechar(long num) {
		for (Conta c : contas) {
			if (c.getNumeroConta() == num) {
				contas.remove(c);
				
				//LOG DE TRANSACAO
				//gerarLog(c, 0, BancarioServiceLogTipoTransacao.FECHAMENTO.toString());
				
				
				return "conta " + num + " fechada com sucesso!";
			}
		}
		return "conta nao encontrado";
	}

	public String efetuarSaque(long num, double valor) {
		String msg = "conta nao cadastrada!";
		for (Conta c : contas) {
			if (c.getNumeroConta() == num) {
				c.setSaldo(c.getSaldo() - valor);
				msg = "valor saque:" + valor;
				
				//LOG DE TRANSACAO
				//gerarLog(c, valor, BancarioServiceLogTipoTransacao.SAQUE.toString());
				
			}
		}
		return msg;
	}

	public String efetuarDeposito(long num, double valor) {
		String msg = "conta nao cadastrada!";
		for (Conta c : contas) {
			if (c.getNumeroConta() == num) {
				c.setSaldo(c.getSaldo() + valor);
				msg = "Valor deposito:" + valor;
				
				//LOG DE TRANSACAO
				//gerarLog(c, valor, BancarioServiceLogTipoTransacao.DEPOSITO.toString());
				
			}
		}
		return msg;
	}

	//Gerar Log de transacao
	private void gerarLog(Conta conta, double valor, String operacao) {
		new BancarioServiceLog().addLog( new Transacao(conta.getNumeroConta(), operacao,
				conta.toString() + " Operacao:" + operacao + "Valor:" + valor, new Date()));

	}

}
