package Pack2;

import Pack1.motocicletas;
import Pack1.vendas;
import java.util.ArrayList;

public class gerenciador_concessionaria {
    private Pack2.estoque estoque;
    private ArrayList<Pack1.vendas> vendas;

    public gerenciador_concessionaria() {
        estoque = new estoque();
        vendas = new ArrayList<>();
    }

    public Pack2.estoque getEstoque() {
        return estoque;
    }

    public void registrarVenda(motocicletas moto, int quantidade) {
        vendas.add(new vendas(moto, quantidade));
    }

    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            for (Pack1.vendas venda : vendas) {
                System.out.println(venda);
            }
        }
    }

    public double calcularTotalVendas() {
        double total = 0;
        for (Pack1.vendas venda : vendas) {
            total += venda.calcularTotalVenda();
        }
        return total;
    }
}
