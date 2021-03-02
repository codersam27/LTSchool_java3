package animals;

import food.Food;

public class Lynx extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Я рысь. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я рысь. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Мяу";
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я рысь. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
