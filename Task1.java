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
