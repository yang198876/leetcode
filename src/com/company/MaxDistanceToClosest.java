package com.company;

public class MaxDistanceToClosest {
    public int maxDistToClosest(int seats[]) {
        int edgeZeroCount = 0;
        int midZeroCount = 0;
        int last1index = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (last1index < 0) {
                    edgeZeroCount = i;
                } else if (i - last1index - 1 > midZeroCount) {
                    midZeroCount = i - last1index - 1;
                }
                last1index = i;
            }
        }
        if (seats.length - last1index - 1 > edgeZeroCount) {
            edgeZeroCount = seats.length - last1index - 1;
        }
        return Math.max(edgeZeroCount, (midZeroCount + 1) / 2);
    }
}
