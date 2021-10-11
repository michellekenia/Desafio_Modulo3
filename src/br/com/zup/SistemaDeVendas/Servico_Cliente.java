package br.com.zup.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    private static List<Cliente> listaDeClientes = new ArrayList<>();

    public static List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("E-mail inválido.");
        }

    }



    public static Cliente cadastrarCliente(String nome, String CPF, String email) {
        Cliente cliente = new Cliente(nome, CPF, email);
        listaDeClientes.add(cliente);
        return cliente;
    }

    public static void exibirListaDeClientes() {
        System.out.println(listaDeClientes);
    }


}
