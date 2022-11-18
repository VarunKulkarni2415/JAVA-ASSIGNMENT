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
