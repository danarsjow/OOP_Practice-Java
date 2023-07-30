
class Dog {
    String breed;
    String size;
    int age;
    String color;
    public String eat() {
        return("The breed: "+breed+" is eating...");
    }
    public String sleep() {
        return("THe breed: "+breed+" is sleeping...");
    }    
}
public class OOP_Practice {
    public static void main(String[] args) {
        Dog dalmatian = new Dog();
        dalmatian.breed = "Dalmatian";
        dalmatian.size = "Large";
        dalmatian.age = 10;
        dalmatian.color = "White";

        Dog kintamani = new Dog();
        kintamani.breed = "Kintamani";
        kintamani.size = "Medium";
        kintamani.age = 7;
        kintamani.color = "Yellow"; 

        System.out.println(kintamani.eat());
        System.out.println(dalmatian.sleep());
        
  }

}
    