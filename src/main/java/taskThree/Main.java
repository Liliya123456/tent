package taskThree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static private Scanner scanner = new Scanner(System.in);
    static private List<Person> personLists = new ArrayList<Person>();

    public static void main(String[] args) {
        createNewPerson();
        String val = scanner.next();
        switch (val) {
            case "1":
                for (Person person : personLists) {
                    System.out.println(person.getFirstName() + person.getLastName() + person.getFavouriteMovie());
                }
                break;
            default:
                createNewPerson();
        }
    }

    /**
     * createNewPerson() skapar nya Class av persoon
     */
    private static void createNewPerson() {
        System.out.println("Skriv in first name:");
        String firstName = scanner.next();
        System.out.println("Skriv in las name:");
        String lastName = scanner.next();
        System.out.println("Skriv in favorite movie:");
        String favoriteMovie = scanner.next();
        personLists.add(new Person(firstName, lastName, favoriteMovie));

    }
}
