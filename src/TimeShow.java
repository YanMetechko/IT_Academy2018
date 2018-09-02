class TimeSegment {
    public int seconds, minutes, hours;
    /*Scanner scan = new Scanner(System.in)*/

    public TimeSegment(int h, int m, int s) {
        /*System.out.print("Input seconds: ");
        seconds = scan.nextInt();
        System.out.print("Input minutes: ");
        minutes = scan.nextInt();
        System.out.print("Input hours: ");
        hours = scan.nextInt();*/
        seconds = s;
        minutes = m;
        hours = h;
    }

    public TimeSegment(int s) {
        hours = s / 3600;
        minutes = (s % 3600) / 60;
        seconds = (s % 3600) % 60;
    }

    public int GetTotalSeconds() {
        int s = (hours * 3600) + (minutes * 60) + seconds;
        return s;
    }

    public int Compare(TimeSegment a) {
        int k;
        if (this.seconds == a.seconds & this.minutes == a.minutes & this.hours == a.hours) {
            k = 0;
        } else if (this.hours > a.hours) {
            k = 1;
        } else if (this.hours == a.hours & this.minutes > a.minutes) {
            k = 1;
        } else if (this.minutes == a.minutes & this.hours == a.hours & this.seconds > a.seconds) {
            k = 1;
        } else k = -1;
        return k;
    }

    public void ShowTime() {
        System.out.println("Time is: " + hours + ":" + minutes + ":" + seconds);
    }
}


public class TimeShow {
    public static void main(String[] args) {
        int i;
        TimeSegment[] time = new TimeSegment[2];
        time[0] = new TimeSegment(12, 34, 56);
        time[1] = new TimeSegment(12945);
        for (i = 0; i < 2; i++) {
            time[i].ShowTime();
        }
        System.out.println(time[0].Compare(time[1]));
    }
}
