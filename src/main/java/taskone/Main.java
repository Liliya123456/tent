package taskone;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static private Pattern pattern = Pattern.compile("[A-Za-z]*");
    String name;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        callYourName();
    }


    /**
     * CallYourName() funktionen som visa första bokstaver
     */
    static void callYourName() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vill du presentera dig?");
        if (scanner.hasNext(pattern)) {

            name = scanner.next();
            if (name.startsWith("Ö")) {
                System.out.println("Namnet örja på Bokstavet Ö och det sista bokstaven i alfabetet!");
            } else {
                System.out.println("Namnet börjar på bokstaven " + name.charAt(0));
            }

        } else {
            callYourName();
        }
    }

}




