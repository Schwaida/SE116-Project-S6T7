public class Clothes extends Items {
   //cloth name;

   public void pickUp(){
      Clothes.clotheCounter++;

   }

   @Override
   public void display() {
         System.out.println("Cloth name: "+getClothesName());

   }
}

class LightClothing extends Clothes{
   @Override
   public void setClothesName(String clothesName) {
      super.setClothesName(clothesName);
   }

   @Override
   public String getClothesName() {
      return super.getClothesName();
   }


}
class LeatherArmor extends Clothes{
   @Override
   public void setClothesName(String clothesName) {
      super.setClothesName(clothesName);
   }

   @Override
   public String getClothesName() {
      return super.getClothesName();
   }


   }

class ChainmailArmor extends Clothes {
   @Override
   public void setClothesName(String clothesName) {
      super.setClothesName(clothesName);
   }

   @Override
   public String getClothesName() {
      return super.getClothesName();
   }

}







