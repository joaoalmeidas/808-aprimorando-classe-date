
public class DataTeste {

	public static void main(String[] args) {
		
		Data dataBissexto = new Data(1, 1, 2016);
		Data dataNormal = new Data(1, 1, 2017);
		
		System.out.println("Calendário 2016 - Ano bissexto\n");
		
		for(int i = 0; i < 366; i++) {
			dataBissexto.proximoDia();
		}
		
		System.out.println("\nCalendário 2017 - Ano normal\n");
		
		for(int i = 0; i < 365; i++) {
			dataNormal.proximoDia();
		}

	}

}
