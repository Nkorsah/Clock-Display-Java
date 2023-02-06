package ClockDisplayJava;
import java.time.format.DateTimeFormatter;
// formats the time into readable text
import java.time.LocalDateTime;
// grabs the time from the computer. 

public class Clock {
    public static void main(String[] args) throws InterruptedException{
        for (int i = 0; i<100; i++){
            System.out.println(TimeGrab());
            Thread.sleep(8);
        }
        System.out.println(TimeGrab().substring(9,11)); // isolates miliseconds
        System.out.println(TimeGrab().substring(0,8));
        System.out.println(TimeGrab().substring(12,14));
    }
    public static String TimeGrab(){
        LocalDateTime local = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY h:mm:ss:SS a");
        String output = dtf.format(local);
        String out = output.substring(18);
        return out;
    }
    public static String DateGrab(){
        LocalDateTime local = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
        String output = dtf.format(local);
        return output;
    }
}
