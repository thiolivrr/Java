import java.util.ArrayList;

class TesteCarro {

   public static void abasteceGas(int gasDoCarro, int qtdGas) {
      gasDoCarro += qtdGas;
   }

   public static void abasteceCarro(Carro carro, int qtdGas) {
      carro.abastece(qtdGas);
   }

   public static void abasteceLista(ArrayList<Carro> carros, int qtdGas) {
      for (Carro carro : carros) {
         carro.abastece(qtdGas);
      }
   }

   public static void main(String[] args) {
      Carro carro01 = new Carro("def");

      System.out.println("1)");
      System.out.println(carro01);

      System.out.println("2)");
      abasteceGas(carro01.getGas(), 2);
      System.out.println(carro01);

      System.out.println("3)");
      abasteceCarro(carro01, 2);
      System.out.println(carro01);

      System.out.println("4)");
      ArrayList<Carro> carros = new ArrayList<Carro>();
      carros.add(carro01);
      carros.add(new Carro("sec"));
      abasteceLista(carros, 4);
      for (Carro carro : carros) {
         System.out.println(carro);
      }
   }

}
