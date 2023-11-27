package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Controller.concessionariaController;
import Model.automovel;

public class Menu {

    public static void keyPress() {
        try {
            System.out.println("\nPressione Enter para continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Você pressionou uma tecla diferente de enter!");
        }
    }

    public static void main(String[] args) {
        concessionariaController carros = new concessionariaController();
        Scanner leia = new Scanner(System.in);

        boolean disponivel = false;
        String modelo = null, cambio = null, titular, novoDono;
        int opcao, renavam, doc = 0, ano;

        while (true) {
            System.out.println("*****************************************************");
            System.out.println("                Agencia de Carros                ");
            System.out.println("*****************************************************");
            System.out.println("            1 - Cadastrar Veiculo                  ");
            System.out.println("            2 - Listar Todas os Carros            ");
            System.out.println("            3 - Buscar numero da conta            ");
            System.out.println("            4 - Atualizar Dados do Comprador      ");
            System.out.println("            5 - Apagar Conta                      ");
            System.out.println("            6 - Desejo Comprar um carro           ");
            System.out.println("            7 - Desejo Vender meu Carro           ");
            System.out.println("            8 - Transferir nome do proprietario   ");
            System.out.println("            9 - Sair                              ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção que deseja realizar: ");

            try {
                opcao = leia.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Cadastrar Automovel\n\n");
                        System.out.println("\nDigite o numero do renavam: ");
                        renavam = leia.nextInt();

                        leia.nextLine(); // Limpa o buffer
                        System.out.println("\nDigite a marca do carro: ");
                        modelo = leia.nextLine();

                        System.out.println("\nDigite o ano do carro: ");
                        ano = leia.nextInt();

                        leia.nextLine(); // Limpa o buffer
                        System.out.println("\nDigite o nome do titular: ");
                        titular = leia.nextLine();

                        do {
                            System.out.println("Documento do carro está em dia ?");
                            System.out.println(" 1 - SIM ");
                            System.out.println(" 2 - NÃO");
                            doc = leia.nextInt();
                        } while (doc < 1 || doc > 2);

                        leia.nextLine(); // Limpa o buffer
                        System.out.println("Digite o tipo de cambio do carro: ");
                        cambio = leia.nextLine();

                        disponivel = (doc == 1);
                        carros.cadastrarVeiculo(new automovel(carros.gerarnumero(), modelo, cambio, titular, disponivel, renavam, ano));
                        System.out.println("Carro cadastrado com sucesso!!");
                        keyPress();
                        break;

                    // outros cases ...

                    case 9:
                        System.out.println("\nObrigado por Escolher a nossa Agencia! Volte sempre!");
                        sobre();
                        leia.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nOpção Inválida!\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros.");
                leia.nextLine(); // Limpa o buffer
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
