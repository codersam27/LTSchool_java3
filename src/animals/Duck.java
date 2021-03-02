package animals;

import food.Food;

public class Duck extends Carnivorous implements Fly, Swim, Voice, Run {
    @Override
    public void fly() {
        System.out.println("Я утка. Умею летать!");
    }

    @Override
    public void run() {
        System.out.println("Я утка. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я утка. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Кря-Кря";
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я утка. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
