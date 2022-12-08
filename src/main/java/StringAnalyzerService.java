import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class StringAnalyzerService {

    private final ExecutorService executor = Executors.newFixedThreadPool(4);
    private final int lines = 10_000;
    private final int stringLength = 100_000;

    public void run() {

        final Repository repo = new Repository();
        final Handler handler = new Handler(repo);
        final Generator generator = new Generator(lines, stringLength, "abc");

        executor.submit(generator.generateStringsInRepository(repo));

        executor.submit(handler.getAnalyzeA());
        executor.submit(handler.getAnalyzeB());
        executor.submit(handler.getAnalyzeC());

        executor.shutdown();

    }
}
