public class PessoaFisica extends Pessoa{
    String cpf;

    public PessoaFisica() {
        super();

    }

    public PessoaFisica(String nome, byte idade, float altura, float peso, String cpf) {
        super(nome, idade, altura, peso);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
