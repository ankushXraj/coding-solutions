# Detect Capital

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like "USA".
- All letters in this word are not capitals, like "leetcode".
- Only the first letter in this word is capital, like "Google".

Given a string `word`, return `true` if the usage of capitals in it is right.

 

 **Example 1:** 

```
Input: word = "USA"
Output: true

```

 **Example 2:** 

```
Input: word = "FlaG"
Output: false

```

 

 **Constraints:** 

- 1 <= word.length <= 100
- word consists of lowercase and uppercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 88.95%)  
**Memory:** 43.2 MB (beats 43.98%)  
**Submitted:** 2026-09-03T04:38:07.789Z  

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        if (count == 0) {
            return true;
        }

        if (count == word.length()) {
            return true;
        }

        if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/detect-capital/)