package com.company;

public class InterLeaveStrings {
    public boolean isInterLeave(String s1, String s2, String s3) {
        if (s3.length() != (s1.length() + s2.length())) {
            return false;
        } else if (s1.length() == s2.length() && s2.length() == s3.length() && s3.length() == 0) {
            return true;
        } else {
            return (s1.charAt(s1.length() - 1) == s3.charAt(s3.length() - 1)
                    && isInterLeave(s1.substring(0, s1.length() - 1), s2, s3.substring(0, s3.length() - 1)))
                    || ((s2.charAt(s1.length() - 1) == s3.charAt(s3.length() - 1)
                    && isInterLeave(s1, s2.substring(0, s1.length() - 1), s3.substring(0, s3.length() - 1))));
        }
    }

}
