package com.estudos.minimumLengthOfStringAfterOperations;

public class MinimumLengthOfStringAfterOperations {
    public static int minLength(String s) {
        int n = s.length();
        boolean[] toRemove = new boolean[n];
        boolean changed;

        do {
            changed = false;
            for (int i = 1; i < n - 1; i++) {
                if (!toRemove[i] && s.charAt(i - 1) == s.charAt(i) && s.charAt(i) == s.charAt(i + 1)) {
                    toRemove[i - 1] = true;
                    toRemove[i + 1] = true;
                    changed = true;
                }
            }
        } while (changed);

        int minLength = 0;
        for (int i = 0; i < n; i++) {
            if (!toRemove[i]) {
                minLength++;
            }
        }
        return minLength;
    }
}
