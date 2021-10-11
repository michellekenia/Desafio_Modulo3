package br.com.zup.SistemaDeVendas;

public class Venda {

    private Vendedor vendedorResponsavel;
    private Cliente cliente;
    private double valorDaVenda;
    private String dataDaVenda;

    public Venda(Vendedor vendedorResponsavel, Cliente cliente, double valorDaVenda, String dataDaVenda) {
        this.vendedorResponsavel = vendedorResponsavel;
        this.cliente = cliente;
        this.valorDaVenda = valorDaVenda;
        this.dataDaVenda = dataDaVenda;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public String getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nVendedor responsavel: " + vendedorResponsavel.getNome() + ", " + vendedorResponsavel.getCPF());
        retorno.append("\nCliente: " + cliente.getNome() + ", " + cliente.getCPF());
        retorno.append("\nValor da venda: " + valorDaVenda);
        retorno.append("\nData da venda: " + dataDaVenda);

        return retorno.toString();
    }
}
