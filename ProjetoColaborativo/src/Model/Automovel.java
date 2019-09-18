package Model;

public class Automovel {

    protected String cor;
    protected String nome;
    protected int ano;
    protected double km;
    protected double valor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Automovel(String cor, String nome, int ano, double km, double valor) {
        this.cor = cor;
        this.nome = nome;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
    }

    public Automovel() {

    }

}
