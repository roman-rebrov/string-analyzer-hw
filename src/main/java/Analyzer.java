import java.util.concurrent.BlockingQueue;

class Analyzer {
    public static int analyzeWithLetter(
            final char letter,
            final int lineLength,
            final BlockingQueue<String> queue
            ){
        int max = 0;

        for (int j = 0; j < lineLength; j++) {
            try {
                int counter = 0;

                String s = queue.take();
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == letter) {
                        counter++;
                    }
                }

                if (counter > max) {
                    max = counter;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return -1;
            }
        }
        return max;
    }
}
