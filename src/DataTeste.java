
public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data(1, 1, 2017);
		
		for(int i = 0; i < 364; i++) {
			data.proximoDia();
		}

	}

}
