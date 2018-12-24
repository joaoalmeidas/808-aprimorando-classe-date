
public class Empregado {
	
	private String primeiroNome;
	private String segundoNome;
	private Data dataDeNascimento;
	private Data dataDeAdmissao;
	
	
	public Empregado(String primeiroNome, String segundoNome, Data dataDeNascimento, Data dataDeAdmissao) {
		super();
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	public String toString() {
		
		return String.format("%s, %s - Nascimento: %s Admissão: %s", segundoNome, primeiroNome, dataDeNascimento, dataDeAdmissao);
		
	}
	

}
