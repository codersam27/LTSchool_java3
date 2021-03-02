package animals;

import food.Food;

public class Hamster extends Herbivore implements Run, Voice {
    @Override
    public void run() {
        System.out.println("Я хомяк. Умею бегать!");
    }

    @Override
    public String voice() {
        return "Пи-пи-пи";
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я хомяк. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
