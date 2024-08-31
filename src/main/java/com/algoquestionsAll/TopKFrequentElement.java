package com.algoquestionsAll;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
Given an integer array nums and an integer k, return the k most frequent elements.
 */

public class TopKFrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> frequencyMap.get(n1) - frequencyMap.get(n2)
        );

        for (int num : frequencyMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) heap.poll();
        }

        int[] topK = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            topK[i] = heap.poll();
        }
        return topK;
    }
}

