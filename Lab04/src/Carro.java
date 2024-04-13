class Carro {
   private String modelo;
   private int gas;
   
   public Carro(String aModelo) {
      this.modelo = aModelo;
      this.gas = 0;
   }

   public String getModelo() {
      return modelo;
   }

   public int getGas() {
      return gas;
   }

   public void abastece(int qtdGas) {
      gas += qtdGas;
   }

   @Override
   public String toString() {
      String res = "Carro:\n";
      res += "Mod: " + modelo + "\n";
      res += "Gas: " + gas + "\n";
      return res;
   }
}
