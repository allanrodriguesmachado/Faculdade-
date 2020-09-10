package AtividadeAvançada;

	import java.util.Scanner;
	
	public class ContaCorrente extends Sistema{
	
		private double valor;
		private String nome;
		
		int opcao = 0;
		Scanner entrada = new Scanner (System.in);
		
		public void lerValores() {
			
		}
		private void lerValoresAgCta() {
			
		}
		public void execCadastramento(String cadNome) {
			for (int i = 0; i<=1; i++) {				
			}
		}		
		public void exeSaque (double saldo) {		
			int contador = 0;
		
			if (valor > saldo) {
				this.valor = (valor - saldo);	
				if  (contador <3) {
						valor--;
						valor--;
			}else {
			System.out.println("Saldo Indisponivel");	
			}
			}
		}		
		public void execDeposito(double saldo) {	
			
			for (int i =0; i<=1;i++) {
				this.valor = saldo;
			}
		}
		public void execExtrato() {
			System.out.println("EXTRATO Conta Corrente");
			System.out.println("Nome: " +nome);
			System.out.println("Numero da Conta: " +getNumConta());
			System.out.println("Numero da Agencia: " +getNumAgencia());			
			valor--;
			System.out.println("Extrato da Conta: " +valor);		
		}
		public void execConsulta() {		
			System.out.println("Consultar Saldo: " +valor);			
		}	
		public void executavel() {
				
				System.out.println("Digite seu Nome");
				nome = entrada.nextLine();
				
					do {	
				System.out.println("Olá " +nome + " Seja Bem Vindo a sua Conta Corrente ");
				System.out.println("1 - sacar");
				System.out.println("2 - depositar");
				System.out.println("3 - extrato");
				System.out.println("4 - consulta");
				System.out.println("5 - sair");
				opcao = entrada.nextInt();
				
				switch (opcao){
				case 1 :
					System.out.println("Quanto deseja sacar? ");					
					exeSaque(entrada.nextDouble());				
					break;
				case 2 :
					System.out.println("quanto deseja depositar ? ");				
					execDeposito(entrada.nextDouble());					
					break;
				case 3 :
					
					entrada.nextLine();
					execExtrato();					
					break;
				case 4 :
					entrada.nextLine();
					execConsulta();
					break;
				} 									
					}while (opcao >= 1 && opcao <=4 ); 
					System.exit(0);
					
		}
	
		}
		
	
	
	
	
		
	
