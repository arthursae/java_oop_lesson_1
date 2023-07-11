public class Hamster extends Animal {

    private String sound;
    public Hamster(String name, String color, String kind, String type, Double weight, Double age) {
        super(name, color, kind, type, weight, age);
        this.sound = "Pfff pfff";
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
