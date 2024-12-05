package Pack1;

public class vendas {
    private motocicletas motocicleta;
    private int quantidade;

    public vendas(motocicletas motocicleta, int quantidade) {
        this.motocicleta = motocicleta;
        this.quantidade = quantidade;
    }

    public double calcularTotalVenda() {
        return motocicleta.getPrecoVenda() * quantidade;
    }

    @Override
    public String toString() {
        return "Venda - Modelo: " + motocicleta.getModelo() + ", Quantidade: " + quantidade +
                ", Total da Venda: R$" + calcularTotalVenda();
    }
}
