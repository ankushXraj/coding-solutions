class Solution {

    private void swapIfGreater(int[] a, int[] b, int i, int j) {
        if (a[i] > b[j]) {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
        }
    }

    public void mergeArrays(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                // Both pointers in array a
                if (left < n && right < n) {
                    if (a[left] > a[right]) {
                        int temp = a[left];
                        a[left] = a[right];
                        a[right] = temp;
                    }
                }

                // Left in a, Right in b
                else if (left < n && right >= n) {
                    swapIfGreater(a, b, left, right - n);
                }

                // Both pointers in array b
                else {
                    if (b[left - n] > b[right - n]) {
                        int temp = b[left - n];
                        b[left - n] = b[right - n];
                        b[right - n] = temp;
                    }
                }

                left++;
                right++;
            }

            if (gap == 1)
                break;

            gap = (gap / 2) + (gap % 2);
        }
    }
}
