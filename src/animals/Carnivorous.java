package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal {
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Спасибо, поел!");
            satiety += food.getFoodValue();
        }
        else System.out.println("Я такое не ем!");
    }
}
