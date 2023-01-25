package JavaProject1;

public class Task11 {
    public static void main(String[] args) {
        String[] arr = {"Maria", "Hernan", "Hector", "Steve","Amanda","Daniela","Javier","Daniela","Javier"};

        for (int x = 0; x < arr.length; x++) {
            for (int j = x+ 1; j < arr.length; j++) {
                if(arr[j].equals(arr[x])){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
