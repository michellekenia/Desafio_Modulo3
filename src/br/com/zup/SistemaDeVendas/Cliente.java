package br.com.zup.SistemaDeVendas;

public class Cliente extends Pessoa {
    public Cliente(String nome, String CPF, String email) {
        super(nome, CPF, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nDigite o nome do cliente: " + getNome());
        retorno.append("\nDigite o CPF do cliente: " + getCPF());
        retorno.append("\nDigite o e-mail do cliente: " + getEmail());
        return retorno.toString();
    }
}
