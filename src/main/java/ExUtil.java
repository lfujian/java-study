import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExUtil {
    public static ExecutorService es = Executors.newCachedThreadPool();
    public static ExecutorService getPool() {
        return es;
    }
}
