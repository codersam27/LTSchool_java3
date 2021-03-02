package food;

public abstract class Meat extends Food {
    @Override
    public String toString() {
        return "мясо";
    }

    public Meat() {
        foodValue = 7;
    }
}
