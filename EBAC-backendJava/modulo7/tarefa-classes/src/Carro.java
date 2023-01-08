public class Carro {
    private float motor;
    private String cambio;
    private short ano;
    private String modelo;
    private byte quantidadePortas;
    private String direcao;
    private short velocidadeAtual;

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(byte quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public short getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(short velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void ligar() {
        System.out.println("Carro ligado!");
    }

    public void desligar() {
        System.out.println("Carro desligado!");
    }

    public void acelerar(short km) {
        this.setVelocidadeAtual(km);
        System.out.println("Carro acelerando á" + km + "/h!");
    }

    public void freiar(short km) {
        this.setVelocidadeAtual(km);
        System.out.println("Freio acionado! Velocidade reduzida para " + km + "/h!");
    }

    public void parar() {
        this.setVelocidadeAtual((short)0);
        System.out.println("Veículo parado!");
    }
}
