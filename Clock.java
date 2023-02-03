package Personal;
import java.time.format.DateTimeFormatter;
// formats the time into readable text
import java.time.LocalDateTime;
// grabs the time from the computer. 

public class Clock {
    public static void main(String[] args) throws InterruptedException{
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, YYYY h:mm:s a");
        System.out.println(dtf.format(local));
        for (int i = 0; i<5; i++){
            Thread.sleep(1000);
            System.out.println(dtf.format(local));
        }
    
    }
}
