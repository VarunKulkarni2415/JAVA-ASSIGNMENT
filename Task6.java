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
