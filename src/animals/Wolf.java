package animals;

import food.Food;

public class Wolf extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {
        System.out.println("Я волк. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я волк. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Р-р-р-р";
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я волк. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
