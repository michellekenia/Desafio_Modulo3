package br.com.zup.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    private List<Cliente> listaDeClientes = new ArrayList<>();

    public void cadastrarCliente(String nome, String CPF, String email) {
        Cliente cliente = new Cliente(nome,CPF,email);
        listaDeClientes.add(cliente);

    }


}
