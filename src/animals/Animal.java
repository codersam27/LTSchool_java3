package animals;

import food.Food;

public abstract class Animal {
    protected int satiety = 0;

    public void showSatiety() {
        System.out.println("Я сыт на: " + satiety);
    }
    public abstract void eat(Food food);
}
