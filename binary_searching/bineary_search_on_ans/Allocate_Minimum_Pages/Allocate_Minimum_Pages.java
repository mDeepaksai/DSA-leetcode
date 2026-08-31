class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;

        long low = 0;
        long high = 0;
        for (int pages : arr) {
            low = Math.max(pages, low);
            high += pages; // Now safely handles large sums without overflowing int
        }

        int ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (maxPage(arr, k, mid)) {
                ans = (int) mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean maxPage(int[] arr, int k, long maxPages) {
        int students = 1;
        long pagesum = 0;
        for (int pages : arr) {
            if (pagesum + pages <= maxPages) {
                pagesum += pages;
            } else {
                students++;
                pagesum = pages;
            }
        }
        return students <= k;
    }
}