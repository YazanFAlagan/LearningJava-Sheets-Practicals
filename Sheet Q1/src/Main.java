public class Main {
    public static void main(String[] args) {
        Person P1 = new Person("Yazan Faisal", 19, "Egypt - Tanta");

        // setter and getter methods
        System.out.println("Name: " + P1.getName());
        System.out.println("Age: " + P1.getAge());
        System.out.println("Country: " + P1.getCountry());
    }
}