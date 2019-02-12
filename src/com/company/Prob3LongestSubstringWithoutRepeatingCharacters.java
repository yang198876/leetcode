package com.company;


public class Prob3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int soFarMax = 0;
        int currLenth = 0;
        String lastSubString = null;
        int beginIndex = 0;
        for (int i = 0; i < s.length(); ) {
            if (lastSubString == null) {
                currLenth++;
                if (currLenth > soFarMax) {
                    soFarMax = currLenth;
                }
            } else {
                int index = lastSubString.indexOf(s.substring(i, i + 1));
                if (index < 0) {
                    currLenth++;
                    if (currLenth > soFarMax) {
                        soFarMax = currLenth;
                    }
                } else {
                    beginIndex = beginIndex + index + 1;
                    currLenth -= index;
                }
            }
            lastSubString = s.substring(beginIndex, i + 1);
            i++;
        }
        return soFarMax;
    }
}
