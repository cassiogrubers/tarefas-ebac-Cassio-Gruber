package factorymethod;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("FÁBRICA DE CARROS");
        System.out.println("================");
        FabricaDeCarro fabrica = new FabricaFiat();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println("================");


        fabrica = new FabricaWolks();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println("================");

        fabrica = new FabricaFord();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println("================");

        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        System.out.println("================");
    }
}
