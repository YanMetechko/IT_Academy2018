import java.util.Scanner;

public class RepeatNumbers {
    public static void main(String[] args) {
        int i, j, k, same;
        boolean next = false;
        int[] InitialArray = new int[10];
        int[] DetectedArray = new int[10];
        Scanner sc = new Scanner(System.in);
        same = 1;
        System.out.println("Enter 10 Array items:");
        for (i = 0; i < 10; i++) {
            InitialArray[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
                if (DetectedArray[k] == InitialArray[i]) {
                    next = true;
                }
            }
            if (next) System.out.println("passed the item");
            else {
                for (j = i + 1; j < 10; j++) {
                    if (InitialArray[i] == InitialArray[j]) {
                        same++;
                    }
                }
            }
            if (same > 1) {
                System.out.println(InitialArray[i] + " repeats " + same + " times");
                same = 1;
                DetectedArray[i] = InitialArray[i];
            }
            next = false;
        }
    }
}
