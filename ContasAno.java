package testestbl;

public class ContasAno{
	
	public int ano;	// representa o ano
	public int mesDoAno; //scanner
	public String nomeMesDoAno;
	public ContasMes ContasDoMes;
	
	//fazer array para os meses do ano.
	
	//Qual ano você esta?, Qual o mes?
	public ContasAno(int ano, int mesDoAno) {  //define o ano// Dentro do objeto ano terá um objeto contasMes para cada mes do ano
		this.ano = ano;
		this.mesDoAno = mesDoAno;
		ContasMes contaMes = new ContasMes(mesDoAno);
		System.out.println(contaMes.mes);
	//	ContasAno.ContasDoMes = 23; HAAAAAAAAAAAAAAA
		if(mesDoAno == 1) {
		nomeMesDoAno = "Janeiro";
			} else if(mesDoAno == 2) {
				nomeMesDoAno = "Fevereiro";
				} else if(mesDoAno == 3) {
					nomeMesDoAno = "Marco";
					} else if(mesDoAno == 4) {
						nomeMesDoAno = "Abril";
						} else if(mesDoAno == 5) {
							nomeMesDoAno = "Maio";}
						 else if(mesDoAno == 10) {
								nomeMesDoAno = "Outubro";}
		System.out.println("Voce esta no ano: " + ano);
		System.out.println("Voce esta no mes: " + nomeMesDoAno);
		
	}
	
	public void adicionaGasto (ContasMes mesDespesa, double gasto, String informacao) {
		mesDespesa.lancarGasto(gasto, informacao);
		System.out.println("Voce gastou " + gasto + "R$ em " + nomeMesDoAno + " Em " + informacao);
	}
	
}