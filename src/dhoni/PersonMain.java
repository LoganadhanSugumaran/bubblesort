package dhoni;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        person.setName("Logu");
        person.setAge(26);
        person1.setName("Dravid");
        person1.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
