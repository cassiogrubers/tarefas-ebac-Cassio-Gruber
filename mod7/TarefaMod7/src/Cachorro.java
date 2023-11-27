public class Cachorro {
    private String nome;

    private String raca;

    private String cor;

    private int peso;

    private int idade;

    private String nomeDoDono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public void latir(){
        System.out.println("Au au");
    }

    public void dormir(){
        System.out.println("ZzzzzZ");
    }

    public String andar(){
        return "Andando";
    }
    public void comer(){
        System.out.println("Comendo");
    }

    public String correr(){
        return "Correndo";
    }

}
