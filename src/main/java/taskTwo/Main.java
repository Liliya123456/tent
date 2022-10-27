package taskTwo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        callYourName();
    }

    static void callYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vill du presentera dig?");
        String name = scanner.next().toLowerCase();
        switch (name.charAt(0)) {
            case 'ö':
                System.out.println("Namnet börja på Bokstavet Ö och det sista bokstaven i alfabetet!");
                break;

            default:
                System.out.println("Namnet börjar på bokstaven " + name.charAt(0));
        }
    }

}
