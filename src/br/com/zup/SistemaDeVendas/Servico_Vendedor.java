package br.com.zup.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class Servico_Vendedor {

    private static List<Vendedor> listaDeVendedores = new ArrayList<>();

    public static List<Vendedor> getListaDeVendedores() {
        return listaDeVendedores;
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")) {
            throw new Exception("E-mail inválido.");
        }
    }

    public static Vendedor cadastrarVendedor(String nome, String CPF, String email) {
        Vendedor vendedor = new Vendedor(nome, CPF, email);
        listaDeVendedores.add(vendedor);
        return vendedor;

    }


    public static void exibirListaDeVendedores() {
        System.out.println(listaDeVendedores);

    }

}
