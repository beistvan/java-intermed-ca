class VendingMachine {
  public static class ChocolateBar {

    public String getName() {
      return "Chokito";
    }

    public double getPrice() {
      return 1.4;
    }

  }
  public static class BagOfChips {    
    
    public String getName() {
      return "Lays";
    }

    public double getPrice() {
      return 1.9;
    }

  }  
}

public class Main{
  public static void main(String[] args){
    VendingMachine.ChocolateBar mikesChocolateBar = new VendingMachine.ChocolateBar();
    VendingMachine.BagOfChips gabbysBagOfChips = new VendingMachine.BagOfChips();
    System.out.printf("Mike's %s chocolate bar costs %1.2f\n", mikesChocolateBar.getName(), mikesChocolateBar.getPrice());
    System.out.printf("Gabby's %s bag of chips costs %1.2f\n", gabbysBagOfChips.getName(), gabbysBagOfChips.getPrice());
  }
}
