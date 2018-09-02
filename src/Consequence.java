public class Consequence {
    public static void main(String[] args) {
        int num = 498;
        int LengthNum = String.valueOf(num).length();
        int[] digit = new int[LengthNum];
        int i;

        boolean truth = false;
        for (i = 0; i <= LengthNum - 1; i++) {
            digit[i] = num % 10;
            num /= 10;
        }
        for (i = 0; i < LengthNum - 1; i++) {
            if (digit[i] > digit[i + 1]) {
                truth = true;
            } else {
                truth = false;
                break;
            }
        }
        System.out.println(truth ? "красотка!" : "подделка!");
    }
}
