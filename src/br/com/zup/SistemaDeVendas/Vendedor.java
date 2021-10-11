package br.com.zup.SistemaDeVendas;

public class Vendedor extends Pessoa {

    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String CPF, String email) {
        super(nome, CPF, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome do vendedor: " + getNome());
        retorno.append("\nCPF do vendedor: " + getCPF());
        retorno.append("\nE-mail do vendeor: " + getEmail());
        return retorno.toString();
    }
}
