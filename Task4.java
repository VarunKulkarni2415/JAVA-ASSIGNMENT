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