package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class ExFor02 {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		Scanner ler = new Scanner(System.in);
		int n=0, par =0, impar=0;
		
		for(n = 0; n < 10; n++) {
			if(n % 2 == 0) {	
				par++;
			}
			else {		
				impar++;
			}
			System.out.println("Digite um n�mero de 1 a 10: ");
			n = ler.nextInt();
			}
		System.out.println("O n�mero de pares � "+par+" e o n�mero de �mpares"
		+ " � "+impar);
	}

}
