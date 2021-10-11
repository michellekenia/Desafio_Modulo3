package br.com.zup.SistemaDeVendas;

public class Vendedor extends Pessoa {

    public Vendedor(String nome, String CPF, String email) {
        super(nome, CPF, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nDigite o nome do vendedor: " + getNome());
        retorno.append("\nDigite o CPF do vendedor: " + getCPF());
        retorno.append("\nDigite o e-mail do vendeor: " + getEmail());
        return retorno.toString();
    }
}
