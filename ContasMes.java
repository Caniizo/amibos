package testestbl;

public class ContasMes {

	
	private double dinheiroSaldo;  //mostra o saldo no banco
	public int mes;             // representa o numero do mes 
	private int i = 0;
	private String informacaoGasto[]; //guarda as informações referente a cada gasto
	private double gastoMes[];			//gasto do mes/array
	private double gasto;			// gasto generico
	private String informacao;		// informacao generica
	public ContasAno contaAno;
	
	
	public ContasMes(int mesDoAno) {
		this.mes = mesDoAno;
	}
	
	public void setMes(int mes) {  //define o mes// Esta inserido dentro do ano
		this.mes = mes;
		System.out.println("Voce criou um novo mes: " + mes);
		
	}

	
	public void lancarGasto(double gasto, String informacao) { //lança um gasto para determinado mes e ano	
		this.gasto = gasto;
		//this.gastoMes[i] = this.gasto;
		//this.informacaoGasto[i] = this.informacao;
		dinheiroSaldo = dinheiroSaldo - this.gasto;
		//System.out.println("Voce adicionou um gasto de "+ gastoMes[i] + "reais referente a " + informacaoGasto[i]);
		//i++;		
	}
	
	public String mostrarGastos() {   //verificar gastos do mes
		return Double.toString(gasto);
		
		
		
		//if(i==0) {
		//	System.out.println("Não existem gastos lancados");
		//} else {
		//	for(int j=0;j<i;j++) {
		//		System.out.println(gastoMes[j]);
		//		System.out.println(informacaoGasto[j]);
		//	}
		//}
	}
}