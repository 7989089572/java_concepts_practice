class Person {
    String name;
}

public class PassByReferenceConcept {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        modify(p);
        System.out.println("After modify: " + p.name); // Output: Doe
    }

    static void modify(Person person) {
        person.name = "Doe"; // This changes the object's property
    }
}
