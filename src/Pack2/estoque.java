package Pack2;

import java.util.ArrayList;

public class estoque {
    private ArrayList<Pack1.motocicletas> motocicletas;

    public estoque() {
        motocicletas = new ArrayList<>();
    }

    public void adicionarMotocicleta(Pack1.motocicletas motocicleta) {
        motocicletas.add(motocicleta);
    }

    public void listarEstoque() {
        if (motocicletas.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Pack1.motocicletas moto : motocicletas) {
                System.out.println(moto);
            }
        }
    }

    public int contarMotocicletas() {
        return motocicletas.size();
    }
}
