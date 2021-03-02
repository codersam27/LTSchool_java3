package animals;

import food.Food;

public class Horse extends Herbivore implements Run, Swim, Voice {

    @Override
    public void run() {
        System.out.println("Я конь. Умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я конь. Умею плавать!");
    }

    @Override
    public String voice() {
        return "Фыр-ф-р-р";
    }

    @Override
    public void eat(Food food) {
        System.out.print("Я конь. Мне дали " + food.toString() + ". ");
        super.eat(food);
    }
}
