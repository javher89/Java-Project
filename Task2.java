package JavaProject1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] countries=new String[3];
        String[] capitals=new String[3];

        int y1 = 0;
        int y2=0;
        while (y1 < countries.length) {
            System.out.print("Enter name of the country: ");
            countries[y1] = scanner.nextLine();
            System.out.print("Enter it's capital: ");
            capitals[y1] = scanner.nextLine();
            y1++;
        }
        while(y2<capitals.length) {
            System.out.println(capitals[y2] + " is the capital of " + countries[y2]);
            y2++;
        }

    }
}
