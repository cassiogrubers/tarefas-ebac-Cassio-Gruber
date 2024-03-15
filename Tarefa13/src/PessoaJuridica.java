public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void imprimirValores(){
        this.setNome(getNome());
        this.setDataNascimento(getDataNascimento());
        this.setEndereco(getDataNascimento());
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
        System.out.println("NOME: "+getNome());
        System.out.println("DATA NASCIMENTO: "+getDataNascimento());
        System.out.println("ENDEREÇO: "+getEndereco());
        System.out.println("CNPJ: "+getCnpj());
        System.out.println("RAZAO SOCIAL: "+getRazaoSocial());
        System.out.println("INSCRIÇÃO ESTADUAL: "+getInscricaoEstadual());
        System.out.println("NOME FANTASIA: "+getNomeFantasia());

    }
}
