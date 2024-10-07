import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 3, 10, 10, 10, 15, 15};


        Arrays.sort(arr);


        System.out.println("remove duplicates:");

        System.out.print(arr[0] + "      ");


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {\
                System.out.print(arr[i] + "      ");
            }
        }
    }
}
