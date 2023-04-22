
public class teste {

	public static void main(String[] args) {
		long value = 12345678912234L;
		
		String valor = Long.toString(value);
		System.out.println(valor.length());
		if (valor.length() == 14) {
			System.out.println("É o tamanho de um cnpj");
		} else {
			System.out.println("Não é o tamanho de um cnpj");
		}

	}

}
