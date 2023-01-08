public class Carro {
    private float motor;
    private String cambio;
    private short ano;
    private String modelo;
    private byte quantidadePortas;
    private String direcao;
    private short velocidadeAtual;

    /**
     * Getter da propriedade motor
     * @return potencia do motor
     */
    public float getMotor() {
        return motor;
    }

    /**
     * Setter da propriedade motor
     * @param motor Representa a potencia do motor
     */
    public void setMotor(float motor) {
        this.motor = motor;
    }

    /**
     * Getter da propriedade cambio
     * @return Tipo do cambio
     */
    public String getCambio() {
        return cambio;
    }

    /**
     * Setter da propriedade cambio
     * @param cambio Tipo do cambio
     */
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    /**
     * Getter da propriedade ano
     * @return Ano de fabricação
     */
    public short getAno() {
        return ano;
    }

    /**
     * Setter da propriedade ano
     * @param ano Ano de fabricação
     */
    public void setAno(short ano) {
        this.ano = ano;
    }

    /**
     * Getter da propriedade modelo
     * @return Modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Setter da propriedade modelo
     * @param modelo Modelo do veículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter da propriedade quantidadePortas
     * @return quantidade de portas que o veículo possui
     */
    public byte getQuantidadePortas() {
        return quantidadePortas;
    }

    /**
     * Setter da propriedade quantidadePortas
     * @param quantidadePortas Quantidade de portas do veículo
     */
    public void setQuantidadePortas(byte quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    /**
     * Getter da propriedade direcao
     * @return Tipo de direção do veiculo
     */
    public String getDirecao() {
        return direcao;
    }

    /**
     * Setter da propriedade direcao
     * @param direcao Tipo de direcao do veículo
     */
    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    /**
     * Getter da propriedadeAtual
     * @return Velocidade atual do veículo
     */
    public short getVelocidadeAtual() {
        return velocidadeAtual;
    }

    /**
     * Setter da velocidadeAtual
     * @param velocidadeAtual Velocidade atual do veículo
     */
    public void setVelocidadeAtual(short velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    /**
     * Método que liga o veículo
     */
    public void ligar() {
        System.out.println("Carro ligado!");
    }

    /**
     * Método que desliga o veículo
     */
    public void desligar() {
        System.out.println("Carro desligado!");
    }

    /**
     * Método que faz o veículo acelerar
     * @param km Velocidade em que o veículo deve acelerar
     */
    public void acelerar(short km) {
        this.setVelocidadeAtual(km);
        System.out.println("Carro acelerando á" + km + "/h!");
    }

    /**
     * Método que faz o veículo freiar
     * @param km Velocidade em que o veículo deve permanecer após freiar
     */
    public void freiar(short km) {
        this.setVelocidadeAtual(km);
        System.out.println("Freio acionado! Velocidade reduzida para " + km + "/h!");
    }

    /**
     * Método para o veículo parar
     */
    public void parar() {
        this.setVelocidadeAtual((short)0);
        System.out.println("Veículo parado!");
    }
}
