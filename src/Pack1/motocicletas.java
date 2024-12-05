package Pack1;

public class motocicletas {
    private String modelo;
    private double precoCompra;
    private double precoVenda;

    public motocicletas(String modelo, double precoCompra, double precoVenda) {
        this.modelo = modelo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double calcularLucro() {
        return precoVenda - precoCompra;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Preço de Compra: R$" + precoCompra + ", Preço de Venda: R$" + precoVenda;
    }
}
