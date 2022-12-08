import java.util.Random;

class Generator {

    private final int linesNumber;
    private final int stringLengthNumber;
    private final String text;

    public Generator (int lines, int stringLength, String text){
        this.linesNumber = lines;
        this.stringLengthNumber = stringLength;
        this.text = text;
    }

    private String generateString (int length){
        final Random random = new Random();
        StringBuilder newString = new StringBuilder();
        for (int j = 0; j < stringLengthNumber; j++) {
            newString.append(text.charAt(random.nextInt(text.length())));
        }
        return newString.toString();
    }

    public Runnable generateStringsInRepository(final Repository repository){
        return () -> {
            for (int i = 0; i < this.linesNumber; i++) {
                String str = this.generateString(stringLengthNumber);
                try {
                    repository.getALetterStorage().put(str);
                    repository.getBLetterStorage().put(str);
                    repository.getCLetterStorage().put(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
