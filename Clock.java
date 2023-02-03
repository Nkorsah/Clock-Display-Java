package Personal;
import java.time.format.DateTimeFormatter;
// formats the time into readable text
import java.time.LocalDateTime;
// grabs the time from the computer. 

public class Clock {
    public static void main(String[] args) throws InterruptedException{
        String x = TimeGrab();
        for (int i = 0; i<5; i++){
            System.out.println(TimeGrab());
            Thread.sleep(1000);
        }
    }
    public static String TimeGrab(){
        LocalDateTime local = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY h:mm:s a");
        return dtf.format(local);
    }
}
