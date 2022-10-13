package testestbl;

public class Teste {

	public static void main(String[] args) {
		
		ContasAno contasFelipe = new ContasAno(2022,10);
		ContasMes contasFelipe_mes = new ContasMes();
		contasFelipe_mes.setMes(0);
		contasFelipe.adicionaGasto(contasFelipe_mes, 20, "Drogas");
		//contasFelipe_mes.lancarGasto(20, "Drogas");
		
		//contasFelipe.lancarGasto(20.00, "corrida de uber");
		//contasFelipe.ContasDoMes.lancarGasto(15, "compra Remedio");
		
		
	

	}

}