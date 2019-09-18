package Model;

public abstract class AbsAluguelAuto {

    private double valorHora;
    private String estadoVeiculo;
    private double combustivel;
    private double kilometragem;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getEstadoVeiculo() {
        return estadoVeiculo;
    }

    public void setEstadoVeiculo(String estadoVeiculo) {
        this.estadoVeiculo = estadoVeiculo;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public AbsAluguelAuto(double valorHora, String estadoVeiculo, double combustivel, double kilometragem) {
        this.valorHora = valorHora;
        this.estadoVeiculo = estadoVeiculo;
        this.combustivel = combustivel;
        this.kilometragem = kilometragem;
    }

    public AbsAluguelAuto() {

    }

}
