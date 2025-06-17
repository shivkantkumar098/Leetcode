import java.util.Random;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        // Random pivot selection
        int pivotIndex = start + rand.nextInt(end - start + 1);
        swap(arr, start, pivotIndex);

        int p = partition(arr, start, end);
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;

        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot) count++;
        }

        int pivotIndex = start + count;
        swap(arr, start, pivotIndex);

        int i = start, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}