package JavaProject1;

public class Task4 {
    public static void main(String[] args) {
        int[][] variables ={{3, 7, 11, 13, 15},
                {11,3,6,12,4}
        };
        for (int x = 0; x < variables.length; x++) {
            for (int y = 0; y<variables[x].length; y++) {
                if (variables[x][y] % 2 == 0) {
                    System.out.println(variables[x][y]);
                }
            }
        }
    }
}
