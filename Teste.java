package testestbl;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		
		ContasAno contasFelipe = new ContasAno(new ContasMes(2),2022,2);
		contasFelipe.adicionaGasto(contasFelipe.ContasDoMes, 100, "Escova de Cabelo");

		ContasAno contasLaura = new ContasAno(new ContasMes(10),2022,10);
		contasLaura.adicionaGasto(contasLaura.ContasDoMes, 10000, "Tattoo");
		
		ContasAno contasBispo = new ContasAno(new ContasMes(10),2022, 10);
		contasBispo.adicionaGasto(contasBispo.ContasDoMes, 500, "Bencoes");
		
		ContasAno contasRizzi = new ContasAno(new ContasMes(2),2022, 2);
		contasRizzi.adicionaGasto(contasRizzi.ContasDoMes, 300, "Ta vivo ai meu");
		
		ContasAno contasBruno = new ContasAno(new ContasMes(10),2022, 10);
		contasBruno.adicionaGasto(contasBruno.ContasDoMes, 350, "Tia do Lanche");
		
		contasBruno.validaDados(2);
		contasBruno.validaDados(10);
		
		
		
		//contasFelipe.adicionaGasto(contaMes, 20, "Drogas");
		//contasFelipe_mes.lancarGasto(20, "Drogas");
		
		//contasFelipe.lancarGasto(20.00, "corrida de uber");
		//contasFelipe.ContasDoMes.lancarGasto(15, "compra Remedio");
		
		
	

	}

}