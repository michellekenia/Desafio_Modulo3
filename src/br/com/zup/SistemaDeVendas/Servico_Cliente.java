package br.com.zup.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class Servico_Cliente {

    private static List<Cliente> cliente = new ArrayList<>();

        private static List<Cliente> listaDeClientes = new ArrayList<>();

        public static Cliente cadastrarCliente(String nome, String CPF, String email) {
            Cliente cliente = new Cliente(nome, CPF, email);
            listaDeClientes.add(cliente);
            return cliente;
        }

    }
