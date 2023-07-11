public abstract class Animal {

    private String name, color, kind, type;

    private Double weight, age;

    public Animal(String name, String color, String kind, String type, Double weight, Double age) {
        this.name = name;
        this.color = color;
        this.kind = kind;
        this.type = type;
        this.weight = weight;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Double getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void makeSound(String sound) {
        System.out.println("Sound: " + sound);
    }

    public void eat(int food) {
        System.out.println("Have eaten: " + food);
    }

    public void drink(int water) {
        System.out.println("Have had water: " + water);
    }

    public void move(int distance) {
        System.out.println("Moved to a distance: " + distance);
    }

    public void sleep(int minutes) {
        System.out.println("Has slept for " + minutes);
    }

    @Override
    public String toString() {
        return "Animal: " + this.type + '\n' +
                "Name: " + this.name + '\n' +
                "Color: " + this.color + '\n' +
                "Kind: " + this.kind + '\n' +
                "Weight: " + weight + " Kg " + '\n' +
                "Age: " + age + " years \n";
    }

    public abstract void makeSound();
}
