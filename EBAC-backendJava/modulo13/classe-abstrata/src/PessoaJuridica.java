public class PessoaJuridica extends Pessoa{
    String cnpj;

    public PessoaJuridica(String cnpj) {
        super();
    }

    public PessoaJuridica(String nome, byte idade, float altura, float peso, String cnpj) {
        super(nome, idade, altura, peso);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
