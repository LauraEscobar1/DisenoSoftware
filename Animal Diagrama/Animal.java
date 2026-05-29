
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected Color color;

    public Animal(String name, Color color) {
        this.name = name;
        this.color = color
    }

    @Override
    public String toString() {

        return "Animal: nombre = \"" + name + ", color= " + color;
    }
}
