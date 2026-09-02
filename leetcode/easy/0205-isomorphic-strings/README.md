# Isomorphic Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`,  *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

 **Example 1:** 

 **Input:**  s = "egg", t = "add"

 **Output:**  true

 **Explanation:** 

The strings `s` and `t` can be made identical by:

- Mapping 'e' to 'a'.
- Mapping 'g' to 'd'.

 **Example 2:** 

 **Input:**  s = "f11", t = "b23"

 **Output:**  false

 **Explanation:** 

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

 **Example 3:** 

 **Input:**  s = "paper", t = "title"

 **Output:**  true

 

 **Constraints:** 

- 1 <= s.length <= 5 * 104
- t.length == s.length
- s and t consist of any valid ascii character.

## Solution

**Language:** Java  
**Runtime:** 25 ms (beats 9.93%)  
**Memory:** 43.9 MB (beats 58.59%)  
**Submitted:** 2026-09-02T18:06:53.878Z  

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (mapST.containsKey(a) && mapST.get(a) != b) {
                return false;
            }

            
            if (mapTS.containsKey(b) && mapTS.get(b) != a) {
                return false;
            }

            mapST.put(a, b);
            mapTS.put(b, a);
        }

        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/isomorphic-strings/)