package poo.cobjectmethods;

public class Car {
    int speed;
    
    // Facilitates the initialization of a class
    // Constructor is the only method that has no void/returning value
    public Car(){
        this.speed = 0;
    }

    // The method uses parameter speed
    public void speedUp(int speed){
        this.speed += speed;
    }

    public void slowDown(int speed){
        if(this.speed == 0 || this.speed < speed)
            this.speed = 0;
        else
            this.speed -= speed;
    }

    public int getSpeed(){
        return this.speed;
    }
}
