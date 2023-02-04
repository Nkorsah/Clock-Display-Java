package ClockDisplayJava;
import ClockDisplayJava.Page;
import ClockDisplayJava.Clock;

public class LiveTime {
        
    public static void main(String[] args) throws InterruptedException{
    Page myPage = new Page();
    Clock clock = new Clock();
    while (true){
        String x = Clock.TimeGrab();
        myPage.update(x);
        Thread.sleep(8);
    }

    }

}
/* Suggestions:
Maybe display a miliseconds button. It could be annoying to look at sometimes

 * 
 * 
 * 
 * 
 * 
 * 
*/