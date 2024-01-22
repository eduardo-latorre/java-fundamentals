package poo.aclasses;
/* 
 * An object is: 
 * Has attributes and methods
 * Can be physical and abstract
 * They're Singular and with Capital letter
 * From a class you can create multiple objects
*/
public class Car {
    //Attributes
    String brand;
    String color;
    int km;

    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.brand = "Susuki";
        myCar.color = "Grey";
        myCar.km = 56000;

        System.out.println("My car is brand " + myCar.brand + " painted " + myCar.color + " color and has " + myCar.km + " km");
    }


}
