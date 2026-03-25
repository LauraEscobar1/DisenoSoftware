
public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public String greets() {
        return "Woof";
    }

    //public void greets(Dog another) {
       // System.out.println("Woooof");
    //}

    @Override
    public String toString() {
        return "Dog: " + super.toString() + ", y hace: "+ greets()+ ".";
    }
}