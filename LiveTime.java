package ClockDisplayJava;
import ClockDisplayJava.Page;
import ClockDisplayJava.Clock;

public class LiveTime {
        
    public static void main(String[] args) throws InterruptedException{
    Page myPage = new Page();
    Clock clock = new Clock();
    for (int i = 0; i< 100; i++){
        String x = Clock.TimeGrab();
        myPage.update(x);
        Thread.sleep(1000);
    }

    }

}
