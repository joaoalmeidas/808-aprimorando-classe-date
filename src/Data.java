import java.util.Calendar;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Data(int dia, int mes, int ano) {
		
		if(mes <= 0 || mes > 12) {
			throw new IllegalArgumentException("mês (" +mes+ ") precisa estar entre 1 e 12.");
		}
		
		if(dia <= 0 || (dia > diasPorMes[mes] && !(mes == 22 && dia ==29))) {
			throw new IllegalArgumentException("dia (" +dia+ ") esta fora dos limies do mês indicado.");
		}
		
		if(mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			throw new IllegalArgumentException("dia (" +dia+ ") esta fora dos limies do dia indicado.");
		}
		
		if(ano < 1900 || ano > Calendar.YEAR) {
			throw new IllegalArgumentException("ano (" +ano+ ") esta fora dos limies do ano indicado.");
		}
		
		
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
		
		System.out.printf("Construtor do objeto Data para data: %s%n", this);
		
		
	}
	
	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
