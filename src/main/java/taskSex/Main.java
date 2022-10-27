package taskSex;

import java.util.Scanner;

public class Main {
    static private Scanner scanner = new Scanner(System.in);
    static private int countOfPoints = 0;

    public static void main(String[] args) {
        scrumqQestionMetod();


    }

    /**
     * scrumqQestionMetod()
     * Fråfor inom Scrum och returnar antalet rätt svar
     */

    static int scrumqQestionMetod() {
        System.out.println("Nämn en av rollerna som finns inom Scrum?");
        String rollerna = scanner.next();
        switch (rollerna.toLowerCase()) {
            case "produktägare":
                countOfPoints++;
                break;
            case "scrummaster":
                countOfPoints++;
                break;
            case "utvecklingteam":
                countOfPoints++;
                break;
        }
        System.out.println("Nämn en av cereminierna som finns inom Scrum?");
        String ceremonierna = scanner.next();
        switch (ceremonierna.toLowerCase()) {
            case "sprintplanering":
                countOfPoints++;
                break;
            case "standup":
                countOfPoints++;
                break;
            case "demo:":
                countOfPoints++;
            case "retrospektiv:":
                countOfPoints++;
                break;
            default:
                countOfPoints--;
        }
        System.out.println("Vad är rekommenderat max antal personer i ett team inom Scrum?");
        int maxperson = scanner.nextInt();
        switch (maxperson) {
            case 3:
                countOfPoints++;
                break;
            case 4:
                countOfPoints++;
                break;
            case 5:
                countOfPoints++;
                break;
            case 6:
                countOfPoints++;
                break;
            case 7:
                countOfPoints++;
                break;
            case 8:
                countOfPoints++;
                break;
            case 9:
                countOfPoints++;
                break;

            default:
                countOfPoints--;
        }
        System.out.println("Scrum har ett dokument där ALL information om SCRUM finns, vad heter dokumentet?");
        String docName = scanner.next();
        switch (docName.toLowerCase()) {
            case "scrumguiden":
                countOfPoints++;
                break;
            default:
                countOfPoints--;
        }
        System.out.println("Vem är det person som får avbryta en Sprint?");
        String scrumPerson = scanner.next();
        switch (scrumPerson.toLowerCase()) {
            case "scrummaster":
                countOfPoints++;
                break;
            default:
                countOfPoints--;
        }

        System.out.println(countOfPoints);
        return countOfPoints;
    }

}
