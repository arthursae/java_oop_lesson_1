public class Dog extends Animal {

    private String sound;
    public Dog(String name, String color, String kind, String type, Double weight, Double age) {
        super(name, color, kind, type, weight, age);
        this.sound = "Woof Woof";
    }

    @Override
    public void makeSound() {
        System.out.println(this.getSound());
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
