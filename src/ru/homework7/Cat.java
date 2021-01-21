package ru.homework7;

public class Cat {
    private final String name;
    private int hungry;
    private boolean satiety;

    public Cat(String name, int hungry, boolean satiety) {
        this.name = name;
        this.hungry = hungry;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (plate.decresfood(getHungry())) {
            System.out.println("Котик съел ... " + hungry + " еды ." );
            satiety = true;
        }else {
            System.out.println("Котик  не покушал, ему необходимо: " + hungry  + " еды, так как в миске мало еды : " + this.satiety);
        }



    }
    public int getHungry() {
        return hungry;
    }
    public void setHungry(int hungry){
        this.hungry = hungry;
    }


}
