import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        int year, month, day;
        boolean LeapYear = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Year: ");
        year = sc.nextInt();
        System.out.print("Input Month: ");
        month = sc.nextInt();
        System.out.print("Input Day: ");
        day = sc.nextInt();
        if (year % 100 != 0) LeapYear = (year % 4 == 0);
        if (year % 100 == 0) LeapYear = (year % 400 == 0);
        if (day < 28) {
            day++;
        } else {
            if (day < 29) {
                if (month == 2) {
                    if (LeapYear) {
                        ++day;
                    } else {
                        ++month;
                        day = 1;
                    }
                }
            } else if (day < 30) {
                if (month == 2) {
                    ++month;
                    day = 1;
                } else {
                    day++;
                }
            } else if (day < 31) {
                if (month != 4 || month != 6 || month != 9 || month != 11) {
                    ++day;
                } else if (month != 12) {
                    month++;
                    day = 1;
                }
            } else {
                year++;
                month = 1;
                day = 1;
            }

        }
        System.out.print("Tomorrow's date is: " + day + "." + month + "." + year);
    }
}


