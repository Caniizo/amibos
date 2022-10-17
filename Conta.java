package testestbl;

public class Conta {

	private String nome;
	private double saldo;
	
	public Conta(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void gastoLancado(double gasto) {
		this.saldo = this.saldo - gasto;
	}
}
