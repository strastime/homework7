package ru.homework7;

public class Main {



    public static void main(String[] args) {
       //Cat cat = new Cat("Miss", 15, false );
       //Cat cat2 = new Cat("Misska", 5, false  );
        //

       Cat [] cats =  new Cat[5];
       cats[0] = new Cat("Misa", 6, false );
       cats[1] = new Cat("Misa", 8, false );
       cats[2] = new Cat("Misa", 15,false );
       cats[3] = new Cat("Misa", 3,false );
       cats[4] = new Cat("Misa", 1,false );
       Plate plate = new Plate(25);
       plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
  /*       cat.eat();
       plate.setFood (plate.getFood() - cat.getHungry());
       cat.setHungry(0);
       plate.info();*/
//
//        cat.eat(plate);
//        cat2.eat(plate);
        plate.info();







    }
}
