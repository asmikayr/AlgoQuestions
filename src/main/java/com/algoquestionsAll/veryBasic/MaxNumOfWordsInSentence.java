package com.algoquestionsAll.veryBasic;

/*
Day 2: Maximum Number of Words Found in Sentences
Problem Description:
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You need to return the maximum number of words found in any sentence from the input array.
 */

public class MaxNumOfWordsInSentence {

    public static void main(String[] args) {
        String[] sentences = {"Alice    and Bob love programming", "I love coding"};

        System.out.println(findMaxNumOfWords(sentences));


    }

    public static int findMaxNumOfWords(String[] sentences){
        int max = 0;

        for (String sentence: sentences) {
            String[] words = sentence.trim().split("\\s+");
            int count = words.length;
            if(count>max) max = count;
        }


        return max;
    }
}
