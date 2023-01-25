package JavaProject1;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers={{20,30,40},{60,70,50,90},};
        int total=0;

        for (int y = 0; y < numbers.length; y++) {
            for (int x = 0; x <numbers[y].length ; x++) {
                total=total+numbers[y][x];
            }
            System.out.println(total);

        }
    }
}
