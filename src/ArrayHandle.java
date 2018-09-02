public class ArrayHandle {
    public static void main(String[] args) {
        int i, max, min, iMin, iMax;
        int[] InitialArray = new int[10];
        for (i = 0; i < 10; i++) {
            InitialArray[i] = (int) (Math.random() * 100);
            System.out.print(InitialArray[i] + " ");
        }
        min = InitialArray[0];
        max = InitialArray[0];
        System.out.println();
        iMin=0;
        iMax=0;
        for (i = 0; i < 10; i++) {
            if (min > InitialArray[i]) {
                min = InitialArray[i];
                iMin = i;
            }
            if (max < InitialArray[i]) {
                max = InitialArray[i];
                iMax = i;
            }
        }
        System.out.println("max = " + max + "; min= " + min);
        InitialArray[iMin] = 0;
        InitialArray[iMax] = 99;
        for (i = 0; i < 10; i++) {
            System.out.print(InitialArray[i] + " ");
        }

    }
}


