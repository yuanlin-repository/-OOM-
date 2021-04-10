import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * -Xmx128m -XX:MaxDirectMemorySize=100M
 */
public class DirectBufferOOM {
    public static void main(String[] args) {
        final int _2M = 1024 * 1024 * 2;
        List<ByteBuffer> buffers = new ArrayList<>();
        int count = 1;
        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_2M);
            buffers.add(byteBuffer);
            System.out.println(count++);
        }
    }
}
