package ru.homework7;

public class Plate {

    private int food;
    private int satiety;
    
    public Plate(int food) {
        this.food = food;
    }

    public void info (){
        System.out.println("Еды в миске : " + this.food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                " food=" + food +
                " satiety= " + satiety +
                '}';
    }


    public int getFood() {
        return food;
    }
    public void setFood(int food){
        this.food = food;
    }

    public boolean decresfood(int hungry) {
        if (hungry > food || hungry <= 0) {
            return false;
        }
        this.food -= hungry;
        return true;

    }

    public void plusFood(int hungry){
           if (hungry < 0){
               return;
           }
           food = food + hungry;
    }
}
