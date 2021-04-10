import java.util.concurrent.TimeUnit;

/**
 * -Xss512k
 */
public class StackOOM {
    public static void infiniteRun() {
        while(true) {
            Thread thread = new Thread(() -> {
                while (true) {
                    try {
                        TimeUnit.HOURS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        infiniteRun();
    }
}
