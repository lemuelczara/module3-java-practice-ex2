public abstract class Veiculo {
    private double velocidade;
    private double aceleracao;
    private double anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public double getAceleracao() {
        return this.aceleracao;
    }

    public double getAnguloDeGiro() {
        return this.anguloDeGiro;
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getPeso() {
        return this.peso;
    }

    public int getRodas() {
        return this.rodas;
    }
}
