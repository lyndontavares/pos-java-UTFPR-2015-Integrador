package integrador.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transacao {
	
	long numeroConta;
	String tipoTransacao; // criacao, saque, deposito, fechamento
	String descricao; // descricao detalhada da transacao (com valores)
	Date data;

	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Transacao [numeroConta=" + numeroConta + ", tipoTransacao=" + tipoTransacao + ", descricao=" + descricao
				+ ", data=" + data + "]";
	}

	public Transacao(long numeroConta, String tipoTransacao, String descricao, Date data) {
		super();
		this.numeroConta = numeroConta;
		this.tipoTransacao = tipoTransacao;
		this.descricao = descricao;
		this.data = data;
	}
	
	public Transacao(){
		
	}
	
	
}