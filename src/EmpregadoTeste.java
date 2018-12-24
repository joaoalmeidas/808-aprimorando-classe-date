
public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Data nascimento = new Data(6, 8, 1993);
		Data admissao = new Data(25, 01, 2019);
		Empregado empregado = new Empregado("João Guilherme", "Almeida dos Santos", nascimento, admissao); 
		
		System.out.println(empregado);
		

	}

}
