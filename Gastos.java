package testestbl;

import java.util.ArrayList;
import java.util.List;

public class Gastos extends Conta {

	private double gasto;
	private String informacao;
	private String ano;	
	private String mes;
	private String dia;
	private static List<Gastos> gastos = new ArrayList<Gastos>(); //Lista de Gastos
	
	
	public Gastos(double valorGasto, String informacao, String ano, String mes, String dia, String nome) {
		super(nome);
		this.gasto = valorGasto;
		this.informacao = informacao;
		this.gastoLancado(valorGasto);
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		gastos.add(this);
	}
	
	public void mostrarGastos_ano(String ano) {   //verificar gastos do ano
		int tamanhoBusca = gastos.size();
			for (int x = 0; x < tamanhoBusca; x++) {
			if (gastos.get(x).getAno() == ano) {
				System.out.println("Encontramos esse gasto de " + Double.toString(gastos.get(x).gasto) + " em " + gastos.get(x).informacao);
			}
		}

	}

	public void mostrarGastos_mes(String mes) {   //verificar gastos do ano
		int tamanhoBusca = gastos.size();
			for (int x = 0; x < tamanhoBusca; x++) {
			if (gastos.get(x).getMes() == mes) {
				System.out.println("Encontramos esse gasto de " + Double.toString(gastos.get(x).gasto) + " em " + gastos.get(x).informacao);
			}
		}

	}

	public void mostrarGastos_dia(String dia) {   //verificar gastos do ano
		int tamanhoBusca = gastos.size();
			for (int x = 0; x < tamanhoBusca; x++) {
			if (gastos.get(x).getMes() == mes) {
				System.out.println("Encontramos esse gasto de " + Double.toString(gastos.get(x).gasto) + " em " + gastos.get(x).informacao);
			}
		}

	}
	
	
	public String getAno() {
		return this.ano;
	}
	
	public String getMes() {
		return this.mes;
	}
	
	public String getDia() {
		return this.dia;
	}
		
	}
