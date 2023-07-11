import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Audrey", "Black", "Sphynx", "Cat", 2.13, 6.2);
        Animal dog = new Dog("Bruno", "Golden", "Labrador", "Dog", 18.55, 5.8);
        Animal hamster = new Hamster("Charlie", "White", "Hamster", "Hamster", 0.11, 0.5);
        Animal parrot = new Parrot("Dexter", "Red Blue", "Australian", "Parrot", 0.23, 0.5);

        Pets myPets = new Pets();
        myPets.addAnimal(cat);
        myPets.addAnimal(dog);
        myPets.addAnimal(hamster);
        myPets.addAnimal(parrot);

        Random r = new Random();
        int minFood = 1, maxFood = 10, minWater = 1, maxWater = 5;

        for (Animal pet : myPets.getAnimalsList()) {
            System.out.println("Animal: " + pet.getType());
            System.out.println("Name: " + pet.getName());
            pet.eat(r.nextInt(minFood, maxFood));
            pet.drink(r.nextInt(minWater, maxWater));
            pet.makeSound();
            System.out.printf("%n");
        }
    }
}
