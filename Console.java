package AtividadeAvançada;

import java.util.Scanner;

class Console {

	static ContaCorrente cr;
	static ContaEspecial ce;
	public static void main(String[] args) {
		int opcao = 0;
		
		cr =  new ContaCorrente();
		ce = new ContaEspecial();
		Scanner entrada = new Scanner(System.in);	
		
		cr.setNumAgencia(24561);
		cr.setNumConta(52046);
		ce.setNumConta(14578);
		ce.setNumAgencia(78945);
		
		
		System.out.println("Qual Conta deseja utilizar");
		System.out.println("1 - Conta Corrente");
		System.out.println("2 - Conta Especial");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.println("Bem vindo a Conta Corrente");			
			cr.executavel();			
			break;			
		case 2:
			System.out.println("Bem vindo a Conta Especial");			
			ce.executavel();
			break;
			default:				
		}
		while (opcao >=1 && opcao <=2);
	}
}
