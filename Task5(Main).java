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
