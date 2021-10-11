package br.com.zup.SistemaDeVendas;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Olá, você está no sistema da Loja de Discos Championship Vinyl");
        System.out.println("Digite 1 para cadastrar um vendedor");
        System.out.println("Digite 2 para cadastrar um cliente");
        System.out.println("Digite 3 para cadastrar uma venda");
        System.out.println("Digite 4 para listar os vendedores cadastrados");
        System.out.println("Digite 5 para listar os clientes cadastrados");
        System.out.println("Digite 6 para listar as vendas cadastradas");
    }

    public static Vendedor cadastrarVendedor(String nome, String CPF, String email) {
        nome = capturarDados("Digite o nome do vendedor: ").nextLine();
        CPF = capturarDados("Digite o CPF do vendedor: ").nextLine();
        email = capturarDados("Digite o e-mail do vendedor: ").nextLine();
        return Servico_Vendedor.cadastrarVendedor(nome, CPF, email);
    }

    public static Cliente cadastrarCliente(String nome, String CPF, String email) {
        nome = capturarDados("Digite o nome do cliente: ").nextLine();
        CPF = capturarDados("Digite o CPF do cliente: ").nextLine();
        email = capturarDados("Digite o e-mail do cliente: ").nextLine();
        return Servico_Cliente.cadastrarCliente(nome, CPF, email);
    }
}
