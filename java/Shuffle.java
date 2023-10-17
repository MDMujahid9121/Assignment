import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);
        list.toArray(arr);
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
