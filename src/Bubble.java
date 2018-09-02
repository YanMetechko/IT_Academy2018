import java.util.Scanner;
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for (i = 0; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        for (i = 0; i < 9; i++) {
            for (j = i + 1; j < 10; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

