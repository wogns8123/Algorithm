import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        if (sentence.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] sentenceArr = sentence.trim().split("\\s+");
            System.out.println(sentenceArr.length);
        }
    }
}
