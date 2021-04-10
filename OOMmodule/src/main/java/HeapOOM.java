import java.util.ArrayList;
import java.util.List;

/**
 * -Xms100M -Xmx100M
 */
public class HeapOOM {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(new Object());
        }
    }
}
