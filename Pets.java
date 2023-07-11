import java.util.List;

public class Pets {

    private final List<Animal> animalsList;

    public Pets() {
        this.animalsList = new AnimalsList<>();
    }

    public void addAnimal(Animal animal) {
        animalsList.add(animal);
    }

    public Animal getAnimal(String kind) {
        for (Animal animal : animalsList) {
            if (animal.getKind().equals(kind)) {
                return animal;
            }
        }
        return null;
    }

    public List<Animal> getAnimalsList() {
        return animalsList;
    }
}
