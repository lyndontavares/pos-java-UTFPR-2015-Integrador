package integrador.soap;

/**
 * 
 * @author Lyndon Tavares
 *
 */

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

/**
 * 
 * @author Lyndon Tavares
 *
 */

@WebService(endpointInterface="integrador.soap.BancarioService")
public class BancarioServiceImpl implements BancarioService{

	
    @Resource
    private WebServiceContext wsContext;
	ContaDAO contas;
	
	public BancarioServiceImpl(){
		contas = new ContaDAO();
	}
	
	@Override
	public long criarConta(String nome, double saldo)   {
		return contas.criarConta(new Conta(0,nome,saldo)).getNumeroConta();
	}
        @Override
	public double consultarSaldo(long numConta)  {
		return contas.consultarSaldo(numConta);
	}

        @Override
	public String efetuarDeposito(long numConta, double valor)   {
		return contas.efetuarDeposito(numConta, valor);
	}

        @Override
	public String efetuarSaque(long numConta, double valor)   {
		return contas.efetuarSaque(numConta, valor);
	}

        @Override
	public String fecharConta(long numConta)  {
		return contas.fechar(numConta);
	}
	

}
