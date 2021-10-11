package br.com.zup.SistemaDeVendas;

public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }

    public Cliente(String nome, String CPF, String email) {
        super(nome, CPF, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nNome do cliente: " + getNome());
        retorno.append("\nCPF do cliente: " + getCPF());
        retorno.append("\nE-mail do cliente: " + getEmail());
        return retorno.toString();
    }
}
