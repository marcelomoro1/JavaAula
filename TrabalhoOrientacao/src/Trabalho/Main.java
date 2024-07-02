package Trabalho;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Arquivo arquivo = new Arquivo("produtos");

    private static void cadastrarProduto(String codigo, String descricao, float precoCusto, float precoVenda, int estoque) {
        Produtos produto = new Produtos(codigo, descricao, precoCusto, precoVenda, estoque);
        arquivo.gravarArquivo(produto);
    }

    private static void alterarPrecoProduto(String codigo, float novoPrecoVenda) {
        List<Produtos> produtos = arquivo.leArquivo();
        for (Produtos p : produtos) {
            if (p.getCodigo().equals(codigo)) {
                p.setPvenda(novoPrecoVenda);
                break;
            }
        }
        arquivo.regravarArquivo(produtos);
    }

    private static void excluirProduto(String codigo) {
        List<Produtos> produtos = arquivo.leArquivo();
        produtos.removeIf(p -> p.getCodigo().equals(codigo)); //Metodo para remover de uma lista
        arquivo.regravarArquivo(produtos);
    }

    private static void listarProdutos() {
        List<Produtos> produtos = arquivo.leArquivo();
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (Produtos p : produtos) {
                System.out.println("Código: " + p.getCodigo() +
                                   ", Descrição: " + p.getDescricao() +
                                   ", Preço de Venda: " + p.getPvenda() +
                                   ", Estoque: " + p.getEstoque());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar preco produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Listar produto");
            System.out.println("5 - Sair do sistema");

            System.out.print("Escolha uma opcao: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.print("Preço de Custo: ");
                    float precoCusto = sc.nextFloat();
                    System.out.print("Preço de Venda: ");
                    float precoVenda = sc.nextFloat();
                    System.out.print("Estoque Disponível: ");
                    int estoque = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha

                    cadastrarProduto(codigo, descricao, precoCusto, precoVenda, estoque);
                    break;

                case 2:
                    System.out.print("Código do produto: ");
                    codigo = sc.nextLine();
                    System.out.print("Novo Preço de Venda: ");
                    precoVenda = sc.nextFloat();
                    sc.nextLine();

                    alterarPrecoProduto(codigo, precoVenda);
                    System.out.println("Preço alterado com sucesso!");
                    break;

                case 3:
                    System.out.print("Código do produto a ser excluído: ");
                    codigo = sc.nextLine();

                    excluirProduto(codigo);
                    System.out.println("Produto excluído com sucesso!");
                    break;

                case 4:
                    listarProdutos();
                    break;

                case 5:
                    System.out.println("Sistema encerrado.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}