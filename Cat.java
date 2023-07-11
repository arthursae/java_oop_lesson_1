public class Cat extends Animal {

    private String sound;
    public Cat(String name, String color, String kind, String type, Double weight, Double age) {
        super(name, color, kind, type, weight, age);
        this.sound = "Meow Meow";
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
