public class PessoaFisica extends Pessoa{
    String cpf;
    String rg;

    public PessoaFisica() {
        super();

    }

    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
