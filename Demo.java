
public class Demo{
   public static void main(String[] args) {
       System.out.println("Bigining Spade");
       try {
           StandardEquipment aa = new StandardEquipment(null, null, 0, 0, 0);
           aa.setMake("JCB");
           aa.setModel("AMR01");
           aa.setPurchaseYear(2022);
           aa.setDurability(5);
           aa.showDetails();
           System.out.println("\n Replacement Year: " + aa.replacementYear());

       } catch (In_durab e) {
           System.out.println(e.getMessage());
       }

       try {
           FuelPoweredEquipment bb = new FuelPoweredEquipment(null, null, 0, 0,0);
           bb.setMake("Botch Mower");
           bb.setModel("Rotak 40");
           bb.setPurchaseYear(2020);
           bb.setUsage(200);
           bb.showDetails();
           System.out.println("\n" + "\nReplacement Year : " + bb.replacementYear());
           bb.setMake("Havana Chain Saw");
           bb.setModel("Rotak 22");
           bb.setPurchaseYear(2019);
           bb.setUsage(300);
           bb.showDetails();
           System.out.println("\n" + "\nReplacement Year : " + bb.replacementYear());

           BatteryPoweredEquipment cc = new BatteryPoweredEquipment(null, null, 0, 0);
           cc.setMake("Nikita Edge Trimmer");
           cc.setModel("RBC411U");
           cc.setPurchaseYear(2021);
           cc.setwaranty(3);
           cc.showDetails();
           System.out.println("\n" + "\nReplacement Year :" + cc.replacementYear());
           cc.setMake("Nikita Brush Cutter");
           cc.setModel("RBC411U");
           cc.setPurchaseYear(2020);
           cc.setwaranty(0);
           cc.showDetails();
           System.out.println("\n" + "\nReplacement Year :" + cc.replacementYear());
       } catch (In_war e) {
           System.out.println(e.getMessage());
       }
   }
}
class In_durab extends Exception {
   In_durab () {
       System.out.println("***************Exception occured : Durability must be greater than 0 and less than or equal to 1******************");
   }
}

class In_war extends Exception {
   In_war () {
       System.out.println("************Exception occured : waranty must be greater than 0****************");
   }
}

abstract class Equipment {
   String make;
   String model;
   int purchaseYear;

   public Equipment(String make, String model, int purchaseYear) {
       this.make = make;
       this.model = model;
       this.purchaseYear = purchaseYear;
   }

   public String getMake() {
       return make;
   }

   public void setMake(String make) {
       this.make = make;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public int getPurchaseYear() {
       return purchaseYear;
   }

   public void setPurchaseYear(int purchaseYear) {
       this.purchaseYear = purchaseYear;
   }

   abstract int replacementYear();

   public void showDetails() {
       System.out.println("Equipment **make=" + make + ", model=" + model + ", purchaseYear=" + purchaseYear + "**");
   }

}

class BatteryPoweredEquipment extends Equipment {
   private int waranty;

   public BatteryPoweredEquipment(String make, String model, int purchaseYear, int waranty) {
       super(make, model, purchaseYear);
       this.waranty = waranty;

   }

   public int getwaranty() {
       return waranty;
   }

   public void setwaranty(int waranty) throws In_war {
       this.waranty = waranty;
       if (waranty <= 0) {
           throw new In_war ();
       }
   }

   public int replacementYear() {
       int replacementYear = waranty + super.getPurchaseYear();
       return replacementYear;
   }

}

class FuelPoweredEquipment extends Equipment {
   int usage;
   int MaximumDays;

   public FuelPoweredEquipment(String make, String model, int purchaseYear, int usage, int maximumDays) {
       super(make, model, purchaseYear);
       this.usage = usage;
       MaximumDays = maximumDays;
   }

   public int getUsage() {
       return usage;
   }

   public void setUsage(int usage) {
       this.usage = usage;
   }

   public int replacementYear() {
       int replacementYear = MaximumDays / usage + super.getPurchaseYear();
       return replacementYear;
   }

}

class StandardEquipment extends Equipment {
   double durability;
   int maximumretention = 7;

   public double getDurability() {
       return durability;
   }

   public void setDurability(double durability) throws In_durab {
       this.durability = durability;
       if (durability == 0 && durability < 1 || durability > 1) {
           throw new In_durab ();
       }
   }

   public int replacementYear() {
       int replacementYear = (int) (maximumretention * durability + super.getPurchaseYear());
       return replacementYear;
   }

   public StandardEquipment(String make, String model, int purchaseYear, double durability, int maximum_retention) {
       super(make, model, purchaseYear);
       this.durability = durability;
       this.maximumretention = maximum_retention;
   }

}
