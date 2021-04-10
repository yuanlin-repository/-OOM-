import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * -Xmx10m -Xms10m
 */
public class GCOverheadOOM {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    //do nothing
                }
            });
        }
    }
}