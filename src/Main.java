import Pack1.motocicletas;
import Pack2.gerenciador_concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gerenciador_concessionaria gerenciador = new gerenciador_concessionaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Gerenciamento de Concessionária");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Motocicleta ao Estoque");
            System.out.println("2. Listar Estoque");
            System.out.println("3. Registrar Venda");
            System.out.println("4. Listar Vendas");
            System.out.println("5. Calcular Total de Vendas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Preço de Compra: ");
                    double precoCompra = scanner.nextDouble();
                    System.out.print("Preço de Venda: ");
                    double precoVenda = scanner.nextDouble();
                    motocicletas moto = new motocicletas(modelo, precoCompra, precoVenda);
                    gerenciador.getEstoque().adicionarMotocicleta(moto);
                    System.out.println("Motocicleta adicionada!");
                    break;
                case 2:
                    gerenciador.getEstoque().listarEstoque();
                    break;
                case 3:
                    System.out.print("Modelo da motocicleta: ");
                    modelo = scanner.nextLine();
                    System.out.print("Quantidade vendida: ");
                    int quantidade = scanner.nextInt();
                    // Simulação: busca no estoque pode ser adicionada aqui
                    moto = new motocicletas(modelo, 0, 0); // Exemplo sem preço
                    gerenciador.registrarVenda(moto, quantidade);
                    break;
                case 4:
                    gerenciador.listarVendas();
                    break;
                case 5:
                    System.out.println("Total de Vendas: R$" + gerenciador.calcularTotalVendas());
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
