import java.util.Scanner;

public class Pangram {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        str = str.replaceAll("", "").toLowerCase();
        String string = "";
        for (char i = 'a'; i <= 'z'; i++) {
            if (str.indexOf(i) != -1) {
                string = string + i;
            }
        }

        if (string.length() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
