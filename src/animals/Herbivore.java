package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Спасибо, поел!");
            satiety += food.getFoodValue();
        }
        else System.out.println("Я такое не ем!");
    }
}
