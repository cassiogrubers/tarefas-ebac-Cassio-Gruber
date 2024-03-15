public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;

    private String estadoCivil;

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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void imprimirValores(){
        this.setNome(getNome());
        this.setDataNascimento(getDataNascimento());
        this.setEndereco(getEndereco());
        this.cpf = cpf;
        this.rg = rg;
        this.estadoCivil=cpf;
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: "+ getRg());
        System.out.println("ESTADO CIVIL: "+ getEstadoCivil());
        System.out.println("NOME: "+getNome());
        System.out.println("DATA NASCIMENTO: "+getDataNascimento());
        System.out.println("ENDEREÇO:"+getEndereco());
    }
}
