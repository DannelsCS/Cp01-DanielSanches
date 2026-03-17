package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class principal {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 0);

        v1.adicionar(50);
        v1.gastar(20);

        System.out.println("Dono: " + v1.getProprietario() +
                " | Placa: " + v1.getPlaca() +
                " | Combustível: " + v1.getCombustivel());
    }
}
