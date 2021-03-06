import java.util.Arrays;
import java.util.Scanner;

public class DrivingLicence {

    public static void checkPlaceOfMine(int place) {
        switch (place) {
            case 1 -> System.out.println(20);
            case 2 -> System.out.println(40);
            case 3 -> System.out.println(60);
            case 4 -> System.out.println(80);
            case 5 -> System.out.println(100);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yourName = scanner.next();
        int numberOfAgents = scanner.nextInt();
        String[] namesOfCustomers = new String[4];
        int counter = 0;

        for (int i = 0; i < 4; i++) {
            namesOfCustomers[i] = scanner.next();
        }

        String[] namesOfCustomersAndMine = { namesOfCustomers[0], namesOfCustomers[1], namesOfCustomers[2],
                namesOfCustomers[3], yourName };

        Arrays.sort(namesOfCustomersAndMine);

        for (String item : namesOfCustomersAndMine) {
            counter++;
            if (yourName.equals(item)) break;
        }
        switch (numberOfAgents) {

            case 1 : checkPlaceOfMine(counter);
            break;
            case 2 : if (counter < 3) {
                System.out.println(20);
            } else if (counter < 5) {
                System.out.println(40);
            } else {
                System.out.println(60);
            } break;
            case 3 : if (counter < 4) {
                System.out.println(20);
            } else {
                System.out.println(40);
            } break;
            case 4 : if (counter < 5) {
                System.out.println(20);
            } else {
                System.out.println(40);
            } break;
        }
    }
}
