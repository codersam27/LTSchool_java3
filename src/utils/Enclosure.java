package utils;

import java.util.HashMap;
import java.util.Map;

public class Enclosure<T> {
    private EnclosureSize enclosureSize;

    public Enclosure() {
        enclosureSize = EnclosureSize.SMALL;
    }
    public Enclosure(EnclosureSize enclosureSize) {
        this.enclosureSize = enclosureSize;
    }
    private final Map<String, T> animalsEnclosure = new HashMap<>();

    public void addAnimal(String id, T animal, EnclosureSize enclosureSize) {
        if (this.enclosureSize == enclosureSize) {
            animalsEnclosure.put(id, animal);
        }
    }

    public T getAnimal(String id) { return animalsEnclosure.get(id); }

    public void removeAnimal(String id) {
        animalsEnclosure.remove(id);
    }

    public void printAnimals() {
        for (String key: animalsEnclosure.keySet()) {
            System.out.println(key + " ---> " + animalsEnclosure.get(key));
        }
    }
}
