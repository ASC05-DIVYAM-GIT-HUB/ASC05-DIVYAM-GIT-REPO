package LAB1;
import java.util.*;

public class ArrayStore {
    private int[] arr = new int[10];
    private int size = 10;

    public void acceptElements(Scanner sc) {
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayUsingWhile() {
        int i = 0;
        while (i < size) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void displayUsingFor() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sortArray() {
        Arrays.sort(arr, 0, size);
        displayUsingFor();
    }

    public int countOccurrences(int num) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public void insertAtPosition(int num, int pos) {
        if (size >= arr.length || pos < 0 || pos > size) {
            return;
        }
        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = num;
        size++;
        displayUsingFor();
    }

    public int[] removeDuplicates() {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(arr[i]);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int val : set) {
            result[i++] = val;
        }
        return result;
    }

    public void displayUnique() {
        int[] unique = removeDuplicates();
        for (int num : unique) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStore store = new ArrayStore();

        store.acceptElements(sc);
        store.displayUsingWhile();
        store.displayUsingFor();
        store.sortArray();

        int num = sc.nextInt();
        System.out.println(store.countOccurrences(num));

        int val = sc.nextInt();
        int pos = sc.nextInt();
        store.insertAtPosition(val, pos);

        store.displayUnique();
        sc.close();
    }
}
