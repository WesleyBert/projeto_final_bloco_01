package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			int opcao;

			while (true) {

				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                Agencia de Carros                ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Cadastrar Veiculo		             ");
				System.out.println("            2 - Listar Todas os Carros               ");
				System.out.println("            3 - Buscar Carro por Placa               ");
				System.out.println("            4 - Atualizar Dados do Comprador         ");
				System.out.println("            5 - Apagar Conta                         ");
				System.out.println("            6 - Desejo Comprar um carro              ");
				System.out.println("            7 - Desejo Vender meu Carro              ");
				System.out.println("            8 - Transferir nome do proprietario     ");
				System.out.println("            9 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção  que desejada realizar:                          ");
				System.out.println("                                                     ");

				opcao = leia.nextInt();

				if (opcao == 9) {
					System.out.println("\nObrigado por Escolher a nossa Agencia! Volte sempre!");
					sobre();
	                 leia.close();
					System.exit(0);
				}

				switch (opcao) {
					case 1:
						System.out.println("Criar Conta\n\n");

						break;
					case 2:
						System.out.println("Listar todas as Carros\n\n");

						break;
					case 3:
						System.out.println("Consultar dados do Carro - por Placa\n\n");

						break;
					case 4:
						System.out.println("Atualizar dados da Conta\n\n");

						break;
					case 5:
						System.out.println("Apagar a Conta\n\n");

						break;
					case 6:
						System.out.println("Comprar Carro\n\n");

						break;
					case 7:
						System.out.println("Vender Carro\n\n");

						break;
					case 8:
						System.out.println("Transferência entre Proprietarios\n\n");

						break;
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}
	    
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por: Wesley Francisco Berto");
			System.out.println("https://www.linkedin.com/in/wesley-berto/");
			System.out.println("https://github.com/WesleyBert");
			System.out.println("*********************************************************");
		}
	}
	
	