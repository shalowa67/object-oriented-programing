public class Oop {
    public static void main(String[] args) {
        
        // Define the Person class properly
        class Person {
            String name;
            int age;

            // Constructor
            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Method to print details
            void printDetails() {
                System.out.println(name + " is " + age + " years old");
            }
        }

        // Create array of Person objects
        Person[] people = {
            new Person("Ben", 10),
            new Person("Mary", 6),
            new Person("leo", 97),
            new Person("kelvin",26)
        };

        // Loop through and print details
        for (Person p : people) {
            p.printDetails();
        }
    }
}
