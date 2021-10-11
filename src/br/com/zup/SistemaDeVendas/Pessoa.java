package br.com.zup.SistemaDeVendas;

public class Pessoa {
    private String nome;
    private String CPF;
    private String email;

    public Pessoa() {
    }

    public Pessoa (String nome, String CPF, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nDigite o nome: " + nome);
        retorno.append("\nDigite o CPF: " + CPF);
        retorno.append("\nDigite o e-mail: " + email);
        return retorno.toString();
    }
}
