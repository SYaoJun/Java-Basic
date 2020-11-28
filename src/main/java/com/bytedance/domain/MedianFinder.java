package com.bytedance.domain;



import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

class Solution {
    int nums[] = new int[]{25, 10, 5, 1};
    int res = 0;
    private  final int N = 1000000007;
    public int waysToChange(int n) {
        dfs(n, 0);
        return res;
    }
    void dfs(int n, int u){
        if(u == nums.length) {
            return;
        }

        for(int j = n/nums[u]; j >= 0; j--){
            n -= j* nums[u];
            dfs(n, u+1);
            res = (res + 1)% N;
        }

    }
}