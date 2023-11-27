package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.concessionariaController;
import Model.automovel;
import Model.concessionariaModel;



public class Menu {

	public static void keyPress() {
		try {
			System.out.println("\n Pressione Enter para continuar...");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}}
		public static void main(String[] args) {
			
			
			
			concessionariaController carros = new concessionariaController();

			Scanner leia = new Scanner(System.in);

			boolean disponivel = false;
			String modelo = null,cambio = null,titular,novoDono;
			int opcao,renavam,doc = 0,ano;

			while (true) {

				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                Agencia de Carros                ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Cadastrar Veiculo		             ");
				System.out.println("            2 - Listar Todas os Carros               ");
				System.out.println("            3 - Buscar numero da conta       ");
				System.out.println("            4 - Atualizar Dados do Comprador         ");
				System.out.println("            5 - Apagar Conta                         ");
				System.out.println("            6 - Desejo Comprar um carro              ");
				System.out.println("            7 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção  que desejada realizar:                          ");
				System.out.println("                                                     ");

				opcao = leia.nextInt();
				try {
					opcao = leia.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("\n Digite valores inteiros");
				}

				if (opcao == 7) {
					System.out.println("\nObrigado por Escolher a nossa Agencia! Volte sempre!");
					sobre();
	                 leia.close();
					System.exit(0);
				}

				switch (opcao) {
					case 1:
						System.out.println("cadastrar Automovel\n\n");
						
						System.out.println("\nDigite o numero do renavam: ");
						renavam = leia.nextInt();
						
						System.out.println("\n Digite a marca do carro: ");
						leia.skip("\\R");
						modelo = leia.nextLine();
						
						System.out.println("\n Digite o ano do carro: ");
						ano = leia.nextInt();
						System.out.println("\n Digite o nome do titular: ");
						leia.skip("\\R");
						titular = leia.nextLine();
						do {
							System.out.println("Documento do carro está em dia ?");
							System.out.println(" 1 - SIM ");
							System.out.println(" 2 - NÃO");
							doc = leia.nextInt();
						}while(doc < 1 && doc > 2 );
						System.out.println("Digite o tipo de cambio do carro: ");
						cambio = leia.nextLine();
						
						switch (doc) {
						case 1:
							System.out.println("Carro esta com o documento em dia!");
							disponivel = true;
							carros.cadastrarVeiculo(new automovel(carros.gerarnumero(),modelo,cambio,titular,disponivel, renavam,ano));
							break;
						case 2:
							System.out.println("Carro esta com o documento atrasado!");
							disponivel = false;
							carros.cadastrarVeiculo(new automovel(carros.gerarnumero(),modelo,cambio,titular,disponivel, renavam,ano));
							break;
						}
						System.out.println("Carro cadastrado com sucesso!!");
						keyPress();
						break;
					case 2:
						System.out.println("Listar todas as Carros\n\n");
							carros.listarTodas();
							keyPress();
						break;
					case 3:
						System.out.println("Consultar dados do Carro - por Renavam\n\n");
						System.out.println("Digite o numero do renavam: ");
						renavam = leia.nextInt();
						carros.procurarPorRenavam(renavam);
						keyPress();
						break;
					case 4:
						System.out.println("Atualizar dados do veiculo\n\n");
						System.out.println("Digite o numero do renavam: ");
						renavam = leia.nextInt();
						
						var buscaCarro = carros.buscarNaCollection(renavam);
						
						if(buscaCarro != null) {
							System.out.println("Digite o numero do renavam");
							renavam = leia.nextInt();
							System.out.println("Digite o nome do titular:");
							leia.skip("\\R?");
							titular = leia.nextLine();
							System.out.println("Digite ano :");
							ano = leia.nextInt();
							System.out.println("Digite a marca do carro: ");
							leia.skip("\\R?");
							titular = leia.nextLine();
							do {
								System.out.println("Documento do carro está em dia ?");
								System.out.println(" 1 - SIM ");
								System.out.println(" 2 - NÃO");
								doc = leia.nextInt();
							}while(doc < 1 && doc > 2 );
							System.out.println("Digite o tipo de cambio do carro: ");
							if(doc == 1) {
								disponivel = true;
							}
							cambio = leia.nextLine();
							carros.atualizar(new automovel(carros.gerarnumero(),modelo,cambio,titular,disponivel, renavam,ano));
						}else {
							System.out.println("Automovel não encontrado!");
						}
						keyPress();
						break;
					case 5:
						System.out.println("Comprar Carro\n\n");
						System.out.println("o modelo do carro: ");
						leia.skip("\\R?");
						modelo = leia.nextLine();
						System.out.println("Digite o ano do carro: ");
						ano = leia.nextInt();
						System.out.println("Compra realizada com sucesso!");
						keyPress();
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
	
	