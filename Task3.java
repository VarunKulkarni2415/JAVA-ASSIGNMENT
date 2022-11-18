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
