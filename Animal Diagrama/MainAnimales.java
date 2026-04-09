public class MainAnimales {
    public static void main(String[] args) {
        Animal myMammal = new Mammal("Gorila");
        System.out.println(myMammal);

        Mammal myCat = new Cat("Whiskers");
        System.out.println(myCat);
        Mammal myDog = new Dog("Buddy");
        System.out.println(myDog);
    }
}
