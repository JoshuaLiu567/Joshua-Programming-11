import java.util.Arrays;

public class Main {

    public static int[] insertElement(int[] arr, int element, int position) {

        int array[] = new int[arr.length + 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = element;
            } else {
                array[i] = arr[j++];
            }
        }
        return array;
    }


    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int element = 55;
        int position = 3;

        System.out.println("Original array: " + Arrays.toString(arr));

        arr = insertElement(arr, element, position);
        System.out.println("Inserted array: " + Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = 11;
        System.out.println("Added array: " + Arrays.toString(arr));

        arr = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("Deleted array: " + Arrays.toString(arr));
        }
            }






