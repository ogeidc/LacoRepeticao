package br.com.generation.lacosrepeticao;

public class ExFor01 {
	public static void main(String[] args) {
		int contador =0;
		for(int i = 1000; i<= 1999; i++) {
		 if(i%11 == 5) {
			
			 System.out.println(i);
		 		contador++;
		}

	}
	System.out.println("Existem "+contador+" n�meros de 1000 a 1999 que quando divididos por 11"
		+ " obtemos resto = 5");

}
}

