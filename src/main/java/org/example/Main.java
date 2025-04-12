package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CadastroVeiculo cadastro = new CadastroVeiculo();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU VEÍCULOS ===");
            System.out.println("1. Incluir Veículo");
            System.out.println("2. Buscar Veículo");
            System.out.println("3. Editar Veículo");
            System.out.println("4. Excluir Veículo");
            System.out.println("5. Listar Início → Fim");
            System.out.println("6. Listar Fim → Início");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    System.out.print("Potência: ");
                    int potencia = scanner.nextInt();
                    System.out.print("Lugares: ");
                    int lugares = scanner.nextInt();
                    scanner.nextLine(); // consumir quebra

                    Veiculo novo = new Veiculo(placa, modelo, marca, categoria, ano, potencia, lugares);
                    cadastro.incluirVeiculo(novo);
                    break;

                case 2:
                    System.out.print("Placa para buscar: ");
                    String buscarPlaca = scanner.nextLine();
                    Veiculo v = cadastro.buscarVeiculo(buscarPlaca);
                    if (v != null) {
                        System.out.println("\nVeículo encontrado:");
                        System.out.println(v);
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Placa do veículo a editar: ");
                    String placaEdit = scanner.nextLine();
                    System.out.print("Novo modelo: ");
                    String modeloEdit = scanner.nextLine();
                    System.out.print("Nova marca: ");
                    String marcaEdit = scanner.nextLine();
                    System.out.print("Nova categoria: ");
                    String categoriaEdit = scanner.nextLine();
                    System.out.print("Novo ano: ");
                    int anoEdit = scanner.nextInt();
                    System.out.print("Nova potência: ");
                    int potenciaEdit = scanner.nextInt();
                    System.out.print("Novos lugares: ");
                    int lugaresEdit = scanner.nextInt();
                    scanner.nextLine(); // consumir quebra

                    boolean editado = cadastro.editarVeiculo(placaEdit, modeloEdit, marcaEdit, categoriaEdit, anoEdit, potenciaEdit, lugaresEdit);
                    System.out.println(editado ? "Veículo editado com sucesso!" : "Veículo não encontrado.");
                    break;

                case 4:
                    System.out.print("Placa do veículo a excluir: ");
                    String placaExcluir = scanner.nextLine();
                    boolean excluido = cadastro.excluirVeiculo(placaExcluir);
                    System.out.println(excluido ? "Veículo excluído!" : "Veículo não encontrado ou está locado.");
                    break;

                case 5:
                    System.out.println("Listando do início ao fim:");
                    cadastro.listarInicioFim();
                    break;

                case 6:
                    System.out.println("Listando do fim ao início:");
                    cadastro.listarFimInicio();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}