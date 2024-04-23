package factorymethod;

public class Palio implements Carro{

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Palio");
        System.out.println("Fabricante: Fiat");
    }
}
