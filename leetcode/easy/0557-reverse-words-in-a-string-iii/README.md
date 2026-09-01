# Reverse Words in a String III

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

 **Example 1:** 

```
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

```

 **Example 2:** 

```
Input: s = "Mr Ding"
Output: "rM gniD"

```

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- s contains printable ASCII characters.
- s does not contain any leading or trailing spaces.
- There is at least one word in s.
- All the words in s are separated by a single space.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 99.61%)  
**Memory:** 46.5 MB (beats 81.11%)  
**Submitted:** 2026-09-01T10:39:17.237Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-words-in-a-string-iii/)