import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****Bem-Vindo ao Gerenciador de shopping*****");


        int resposta = 0;

        while (resposta != 3) {
            System.out.println("(1) criar uma loja\n" + "(2) criar um produto\n" + "(3) sair\n" + "Digite a Opcao Desejada:\n");
            resposta = scanner.nextInt();
            scanner.nextLine();
            System.out.println(resposta);

            switch (resposta) {
                case 1: {

                    System.out.println("Digite o nome da loja: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a quantidade de funcionarios: ");
                    int quantidadeDeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o salario base Funcionario");
                    double salarioBaseFuncionario = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Agora vamos preencher o endereço da Loja");
                    System.out.println("Digite o nome da Rua");
                    String nomeDaRua = scanner.nextLine();
                    System.out.println("Digite a cidade");
                    String cidade = scanner.nextLine();
                    System.out.println("Digite o Estado");
                    String estado = scanner.nextLine();
                    System.out.println("Digite o pais");
                    String pais = scanner.nextLine();
                    System.out.println("Digite o CEP");
                    String cep = scanner.nextLine();
                    System.out.println("digite o numero");
                    String numero = scanner.nextLine();
                    System.out.println("Digite o complemento");
                    String complemento = scanner.nextLine();
                    System.out.println("Para finalizar vamos preencher a data de fundacao da loja");

                    System.out.println("Digite o dia de fundacao");
                    int dia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o mes de fundacao");
                    int mes = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o ano de fundacao");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    Loja loja1 = new Loja(nome, quantidadeDeFuncionarios, salarioBaseFuncionario, new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento), new Data(dia, mes, ano));
                    System.out.println(loja1);
                    break;
                }

                case 2:
                    System.out.println("Digite o nome do produto");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preco do produto");
                    double preco = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Agora vamos preencher a data de validade do produto");
                    System.out.println("Digite o dia de vencimento");
                    int dia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o mes de vencimento");
                    int mes = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o ano de vencimento");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    Produto produto = new Produto(nome, preco, new Data(dia, mes, ano));

                    //verificando a data de validade do produto criado
                    if(produto.estaVencido(new Data(20,10,2023))) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NAO VENCIDO");
                    }

                    break;
                case 3:
                    System.out.println("saindo...");
                    break;


                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }

    }
}
