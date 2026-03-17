package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private int combustivel;

    public Veiculo(String proprietario, String placa, int combustivel){
        this.setProprietario(proprietario);
        this.setPlaca(placa);
        this.setCombustivel(combustivel);
    }

    public void setCombustivel(int combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        }
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void adicionar(int valor) {
        if (valor > 0) {
            combustivel += valor;
        }
    }

    public void gastar(int valor) {
        if (valor > 0 && combustivel >= valor) {
            combustivel -= valor;
        }
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
