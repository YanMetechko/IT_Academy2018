import java.util.Scanner;

class ArrayMaster {

    //private Scanner input = new Scanner(System.in);
    //public int[] TenInt= new int[10];

    public static int[] InPut(int size) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void PrintArray(int[] array) {
        int i;
        System.out.print("Значение - " + array[0] + " | ");
        for (i = 1; i < array.length; i++) {
            System.out.print("Значение " + (i + 1) + " - " + array[i] + " | ");
        }
    }

    public static int[] Sorting(int[] array) {
        int i, j;
        for (i = 0; i < (array.length - 1); i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}

public class ChiefArr {
    public static void main(String[] args) {
        int[] MyArray = ArrayMaster.InPut(10);
        ArrayMaster.PrintArray(MyArray);
        MyArray = ArrayMaster.Sorting(MyArray);
        System.out.println();
        ArrayMaster.PrintArray(MyArray);
    }
}