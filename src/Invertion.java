import java.util.Scanner;

public class Invertion {
    public static void main(String[] args) {
        int i, j, k;
        int[] InitialArray = new int[10];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            InitialArray[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            System.out.print(InitialArray[i] + " ");
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            j = InitialArray[i];
            k = InitialArray[9-i];
            InitialArray[i] = k;
            InitialArray[9-i] = j;
        } for (i = 0; i < 10; i++) {
            System.out.print(InitialArray[i] + " ");
        }
    }
}