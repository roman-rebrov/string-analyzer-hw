import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Repository {
    private static final BlockingQueue<String> aLetterStorage = new ArrayBlockingQueue(100);
    private static final BlockingQueue<String> bLetterStorage = new ArrayBlockingQueue(100);
    private static final BlockingQueue<String> cLetterStorage = new ArrayBlockingQueue(100);

    public BlockingQueue<String> getALetterStorage(){
        return aLetterStorage;
    }

    public BlockingQueue<String> getBLetterStorage(){
        return bLetterStorage;
    }

    public BlockingQueue<String> getCLetterStorage(){
        return cLetterStorage;
    }

}
