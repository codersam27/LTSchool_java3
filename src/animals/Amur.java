package animals;

import food.Food;

public class Amur extends Herbivore implements Swim {
    @Override
    public void swim() {
        System.out.println("Я рыба амур. Умею плавать!");
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я амур. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
