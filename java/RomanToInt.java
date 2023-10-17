import java.util.*;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String roman = sc.nextLine().toUpperCase();
        sc.close();
        int answer = romanToInteger(roman);
        System.out.println("Integer:" + answer);
    }

    public static int romanToInteger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));

            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }

            prev = current;
        }

        return result;
    }
}