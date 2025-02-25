package Controle;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm, parametroDois;

		System.out.println("Digite o primeiro valor inteiro:");
		parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo valor inteiro:");
		parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException exception) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm<parametroDois) {
			
			int diferenca = parametroDois - parametroUm;
			
			for(int i =1; i<=diferenca;i++ ) {
				System.out.println("Imprimindo o número " + i);
			}
		}else {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
	}
}
