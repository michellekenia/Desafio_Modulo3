package br.com.zup.SistemaDeVendas;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Olá, você está no sistema da Loja de Discos Championship Vinyl.");
        System.out.println("Digite 1 para cadastrar um vendedor");
        System.out.println("Digite 2 para cadastrar um cliente");
        System.out.println("Digite 3 para cadastrar uma venda");
        System.out.println("Digite 4 para listar os vendedores cadastrados");
        System.out.println("Digite 5 para listar os clientes cadastrados");
        System.out.println("Digite 6 para listar as vendas cadastradas");
        System.out.println("Digite 7 para sair do sistema");
    }

    public static Vendedor cadastrarVendedor() {
        String nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        String CPF = capturarDados("Digite o CPF do vendedor: ").nextLine();
        String email = capturarDados("Digite o e-mail do vendedor: ").nextLine();
        return Servico_Vendedor.cadastrarVendedor(nome, CPF, email);
    }

    public static Cliente cadastrarCliente() throws Exception {
        String nome = capturarDados("Digite o nome do cliente: ").nextLine();
        String CPF = capturarDados("Digite o CPF do cliente: ").nextLine();
        String email = capturarDados("Digite o e-mail do cliente: ").nextLine();
        return Servico_Cliente.cadastrarCliente(nome, CPF, email);
    }

    public static Venda cadastrarVenda() {
        String email = capturarDados("Digite o e-mail do vendedor responsável: ").nextLine();

        Vendedor vendedor = new Vendedor();

        for (Vendedor vendedores : Servico_Vendedor.getListaDeVendedores()) {

            boolean vendedorVerificado = vendedores.getEmail().equals(email);

            if (vendedorVerificado) {
                vendedor = vendedores;
            }
        }
        String CPF = capturarDados("Digite o CPF do cliente: ").nextLine();

        Cliente cliente = new Cliente();

        for (Cliente clientes : Servico_Cliente.getListaDeClientes()) {

            boolean clienteVerificado = clientes.getCPF().equals(CPF);

            if (clienteVerificado) {
                cliente = clientes;
            }
        }

        double valor = capturarDados("Digite o valor da venda: ").nextDouble();
        String data = capturarDados("Digite a data da venda: ").nextLine();

        return Servico_Venda.cadastrarVenda(cliente, vendedor, valor, data);
    }

    public static void exibirVendedores() {
        Servico_Vendedor.exibirListaDeVendedores();
    }

    public static void exibirClientes() {
        Servico_Cliente.exibirListaDeClientes();
    }

    public static void exibirVendas() {
        Servico_Venda.exibirListaDeVendas();
    }

    public static void executar() {
        boolean menu = true;

        while (menu) {
            menu();
            int opcaoUsuario = capturarDados("Digite a opção desejada.").nextInt();

            if (opcaoUsuario == 1) {
                Vendedor vendedor = cadastrarVendedor();

            } else if (opcaoUsuario == 2) {
                Cliente cliente = cadastrarCliente();

            } else if (opcaoUsuario == 3) {
                Venda venda = cadastrarVenda();

            } else if (opcaoUsuario == 4) {
                exibirVendedores();

            } else if (opcaoUsuario == 5) {
                exibirClientes();

            } else if (opcaoUsuario == 6) {
                exibirVendas();
            } else if (opcaoUsuario == 7) {
                menu = false;
            } else {
                System.out.println("Digite um número válido");
            }


        }


    }


}

