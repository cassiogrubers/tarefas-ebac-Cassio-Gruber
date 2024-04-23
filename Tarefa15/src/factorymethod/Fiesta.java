package factorymethod;

public class Fiesta implements Carro{

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Fiesta");
        System.out.println("Fabricante: Ford");
    }
}
