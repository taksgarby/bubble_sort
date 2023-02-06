import java.util.Arrays;

public class Bubble {
    static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length -1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j+1]) {
                    int tempBox = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tempBox;
                }
    }

    public static void main(String[] args) {
        int[] data = {4, 6, 3, 1, 9};
        Bubble.bubbleSort(data);

        System.out.println(Arrays.toString(data));
    }
}
