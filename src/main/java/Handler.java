import java.util.concurrent.BlockingQueue;

class Handler {

    private final Repository repository;

    public Handler(final Repository repo) {
        this.repository = repo;
    }

    public Runnable getAnalyzeA() {

        final BlockingQueue<String> queue = repository.getALetterStorage();
        final char forEquals = 'a';

        return () -> {

            String result = "";
            int prev = 0;

            while (true) {
                try {
                    int counter = 0;

                    String s = queue.take();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == forEquals) {
                            counter++;
                        }
                    }

                    if (counter > prev) {
                        result = s;
                        prev = counter;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Runnable getAnalyzeB() {

        final BlockingQueue<String> queue = repository.getBLetterStorage();
        final char forEquals = 'b';


        return () -> {

            String result = "";
            int prev = 0;

            while (true) {
                try {
                    int counter = 0;

                    String s = queue.take();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == forEquals) {
                            counter++;
                        }
                    }

                    if (counter > prev) {
                        result = s;
                        prev = counter;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public Runnable getAnalyzeC() {

        final BlockingQueue<String> queue = repository.getCLetterStorage();
        final char forEquals = 'c';

        return () -> {

            String result = "";
            int prev = 0;

            while (true) {
                try {
                    int counter = 0;

                    String s = queue.take();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == forEquals) {
                            counter++;
                        }
                    }

                    if (counter > prev) {
                        result = s;
                        prev = counter;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }



}
