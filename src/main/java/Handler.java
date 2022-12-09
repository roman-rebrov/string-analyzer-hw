import java.util.concurrent.BlockingQueue;

class Handler {


    public Runnable getAnalyzeTask(
            final char letter,
            final int lineLength,
            final BlockingQueue<String> queue
    ) {


        return () -> {

            final int max = Analyzer.analyzeWithLetter(letter, lineLength, queue);
            System.out.println("Max qty of " + letter + " int all texts: " + max);

        };
    }

}
