package integrador.soap;

/**
 * 
 * @author Lyndon Tavares
 *
 */

public class Conta {

	private String nome;
	private long numeroConta;
	private double saldo;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(){
		
	}
	
	public Conta(long numeroConta, String nome, double saldo) {
		super();
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", numeroConta=" + numeroConta + ", saldo=" + saldo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numeroConta ^ (numeroConta >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta != other.numeroConta)
			return false;
		return true;
	}
	
	
	
}
