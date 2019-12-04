package Programa;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Financeiro {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Connection connection = new Conexao().getConnection();

        System.out.println("Financeiro");
        System.out.println("Escolha a Opção: ");
        int opcao = 0;
        do {
            imprimirOpcoes();
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                // cadastrarPessoas(scanner, pessoas);
                cadastrarPessoas(scanner);
                break;
            case 2:
                // cadastrarProventos(scanner, proventos);
                cadastrarProventos(scanner);
                break;
            case 3:
                // cadastrarDividas(scanner, dividas);
                cadastrarDividas(scanner);
                break;
            case 4:
                // consultarConta(scanner, contas);
                break;
            case 5:
                System.out.println("OBRIGADO!");
                break;
            default:
                System.out.println("OÇÃO INVÁLIDA!");
                break;
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static void imprimirOpcoes() {
        System.out.println("Escolha a Opção: ");
        System.out.println("1 Cadastrar Cliente");
        System.out.println("2 Cadastrar Proventos");
        System.out.println("3 Cadastrar Dividas");
        System.out.println("4 Consultar Conta");
        System.out.println("5 Sair");
    }

    private static void cadastrarPessoas(Scanner scanner) {

        System.out.println("Informe o Nome: ");
        String nome = scanner.next();
        System.out.println("Informe o Email: ");
        String email = scanner.next();
        Pessoas pessoa = new Pessoas(nome, email);
    }

    private static void cadastrarProventos(Scanner scanner) {

        System.out.println("Informe o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Informe o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Informe o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Informe o Imposto: ");
        double imposto = scanner.nextDouble();
        Proventos provento = new Proventos(mes, ano, valor, imposto);
    }

    private static void cadastrarDividas(Scanner scanner) {

        System.out.println("Informe o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Informe o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Informe o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Informe o % do Imposto: ");
        double percDesconto = scanner.nextDouble();
        Dividas divida = new Dividas(mes, ano, ano, valor, percDesconto);
    }

}