
public class Mammal extends Animal {

    public Mammal(String name) {
        super(name, Color.NEGRO);
    }

    @Override
    public String toString() {
        return "Mamifero: " + super.toString() + ".";
    }
}