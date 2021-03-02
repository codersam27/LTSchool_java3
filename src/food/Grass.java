package food;

public abstract class Grass extends Food {
    @Override
    public String toString() {
        return "сено";
    }

    public Grass() {
        foodValue = 5;
    }
}
