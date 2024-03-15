
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Cássio");;
        pf.setDataNascimento("10/07/1988");
        pf.setEndereco("Rua Afonso Pena, 350");
        pf.setCpf("01922929220");
        pf.setRg("17257864");
        pf.setEstadoCivil("Solteiro");
        pf.imprimirValores();
        System.out.println();
        System.out.println("*********************************************************");
        System.out.println();
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Usuário-Gerente");
        pj.setDataNascimento("10/10/1998");
        pj.setEndereco("Rua Amazona, 150");
        pj.setCnpj("02.343.150/0001-77");
        pj.setRazaoSocial("Hotelaria");
        pj.setInscricaoEstadual("33142371000167");
        pj.setNomeFantasia("Hotel Beira-Rio");
        pj.imprimirValores();
    }
}