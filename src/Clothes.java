public class Clothes extends Items {
   //cloth name;

   /*public void pickUp(){
      Clothes.clotheCounter++;

   }*/

   @Override
   public void display() {
         System.out.println("Cloth name: "+getClothesName());
   }

   @Override
   public void pickUp() {

   }


}

class LightClothing extends Clothes{
   public LightClothing(){
      setValue(2);
      setWeight(10);

   }
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
   public LeatherArmor(){
      setValue(4);
      setWeight(20);
   }
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
   public ChainmailArmor(){
      setValue(6);
      setWeight(30);
   }
   @Override
   public void setClothesName(String clothesName) {
      super.setClothesName(clothesName);
   }

   @Override
   public String getClothesName() {
      return super.getClothesName();
   }

}







