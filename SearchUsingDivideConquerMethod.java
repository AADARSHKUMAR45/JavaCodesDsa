public class SearchUsingDivideConquerMethod {

    static int Search(int[] arr, int si, int tar, int ei) {
        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Target found
        if (arr[mid] == tar) {
            return mid;
        }

        // Left half is sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= tar && tar <= arr[mid]) {
                return Search(arr, si, tar, mid - 1);
            } else {
                return Search(arr, mid + 1, tar, ei);
            }
        }
        // Right half is sorted
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return Search(arr, mid + 1, tar, ei);
            } else {
                return Search(arr, si, tar, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 7, 0, 1, 2};
        int tar = 0;

        int index = Search(arr, 0, tar, arr.length - 1);
        System.out.println("Target found at index: " + index);
    }
}
