public class Main {
    public static void main(String[] args) {

        Carro carroTeste = new Carro();

        carroTeste.setModelo("Mitsubishi Lancer");
        carroTeste.setAno((short)2015);
        carroTeste.setCambio("Manual");
        carroTeste.setMotor((float)2.0);
        carroTeste.setDirecao("Elétrica");
        carroTeste.setQuantidadePortas((byte)2);
        carroTeste.setVelocidadeAtual((short)0);

        carroTeste.ligar();
        carroTeste.acelerar((short)50);
        carroTeste.freiar((short)30);
        carroTeste.parar();
        carroTeste.desligar();
    }
}