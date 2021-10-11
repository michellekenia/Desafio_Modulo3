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

    public static void verificarEmailRepetido(String email) throws Exception {

        Cliente cliente = new Cliente();

        for (Cliente clientes : listaDeClientes) {

            boolean clienteVerificado = clientes.getEmail().equals(email);

            if (clienteVerificado) {
                cliente = clientes;
                throw new Exception("E-mail já cadastrado. Tente novamente");
            }

        }

    }


    public static Cliente cadastrarCliente(String nome, String CPF, String email) throws Exception {
        validarEmail(email);
        verificarEmailRepetido(email);
        Cliente cliente = new Cliente(nome, CPF, email);
        listaDeClientes.add(cliente);
        return cliente;
    }






    public static void exibirListaDeClientes() {
        System.out.println(listaDeClientes);
    }


}
