package br.com.zup.SistemaDeVendas;

import java.util.ArrayList;
import java.util.List;

public class Servico_Venda {

    private static List<Venda> listaDeVendas = new ArrayList<>();

    public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedor, double valor, String data) {
        Venda venda = new Venda(vendedor, cliente, valor, data);
        listaDeVendas.add(venda);
        return venda;
    }

    public static void exibirListaDeVendas() {
        System.out.println(listaDeVendas);

    }
}
