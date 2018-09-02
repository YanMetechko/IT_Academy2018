import java.util.Scanner;

class Patient {
    public int age;
    public String name;
    public String diagnosis;
    String sym;
    public boolean Smoking;
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    public Patient() {
        System.out.print("Input patient's name: ");
        name = scan1.nextLine();
        System.out.print("Input patient's age: ");
        age = scan1.nextInt();
        System.out.print("Input patient's diagnosis: ");
        diagnosis = scan2.nextLine();
        System.out.print("Does patient smoke? (Y/N) ");
        sym = scan1.next();
        if (sym.equals("Y")) Smoking = true;
        System.out.println();
    }

    public void PrintPatient() {
        System.out.println("Пациент " + name + " возраст: " + age);
    }
}


public class PatientBase {
    public static void main(String[] args) {
        int i;
        Patient[] Person = new Patient[3];
        for (i = 0; i < 3; i++) {
            Person[i] = new Patient();
        }
        for (i = 0; i < 3; i++) {
            Person[i].PrintPatient();
        }
        SearchPatient(Person);
    }

    public static void SearchPatient(Patient[] array) {
        int i;
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Would you like to search by name(N) or age(A)?");
        String searchid = scan3.next();
        if (searchid.equals("N")) {
            System.out.println("Searching by name... Insert the name");
            String nameid = scan4.next();
            for (i = 0; i < array.length; i++) {
                if (nameid.equals(array[i].name)) System.out.println(array[i].name + " " + array[i].diagnosis);
            }
        }
        else if (searchid.equals("A")) {
            System.out.println("Searching by age... Insert the age");
            int ageid = scan5.nextInt();
            for (i = 0; i < array.length; i++) {
                if (ageid == array[i].age) System.out.println(array[i].name + " " + array[i].diagnosis);
            }
        } else System.out.println("No searching executed");
    }
}

