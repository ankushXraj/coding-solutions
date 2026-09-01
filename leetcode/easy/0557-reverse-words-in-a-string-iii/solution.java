class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        int start = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || arr[i] == ' ') {

                int left = start;
                int right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return new String(arr);
    }
}