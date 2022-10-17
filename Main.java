package testestbl;


public class Main {

	public static void main(String[] args) {
		
		
		Gastos gastosFestas = new Gastos(1500, "RapInCena", "2022", "10", "15", "Felipe");
		
		Gastos gastosBebidas = new Gastos(1000, "Vodka", "2021", "12", "09", "Felipe");
		
		Gastos gastosGerais = new Gastos(300, "Tristeza", "2022", "03", "15", "Felipe");
	
		Gastos gastosComida = new Gastos(280, "Bolacha", "2022", "10", "15", "Felipe");
//		
//		Gastos gastosBruno = new Gastos("2022", "10","16", 50);
		

//		gastosBruno.lancarGasto(260, "Tia do Lanche");
//		gastosFelipe.lancarGasto(1060, "Rap in Cena");
//		gastosFelipe.lancarGasto(15, "Uber");
//		gastosBruno.lancarGasto(125, "Whey");
//		
	
//		gastosFestas.mostrarGastos_ano("2022");
		gastosFestas.mostrarGastos_mes("10");

	}

}