package app;

public class Main {

    public static void main(String[] args) {

        int[] list =
                {2, 5, 8, 12, 16, 23, 38};

        System.out.println(
                binarySearch(list, 23)
        );

        System.out.println(
                binarySearch(list, 100)
        );
    }

    public static int binarySearch(
            int[] list,
            int key
    ) {

        int left = 0;

        int right = list.length - 1;

        while (left <= right) {

            int mid =
                    (left + right) / 2;

            if (list[mid] == key) {

                return mid;
            }

            if (list[mid] < key) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return -1;
    }
}