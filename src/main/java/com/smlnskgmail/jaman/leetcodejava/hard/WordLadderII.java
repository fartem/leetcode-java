package com.smlnskgmail.jaman.leetcodejava.hard;

import java.util.*;

// https://leetcode.com/problems/word-ladder-ii/
public class WordLadderII {

    private final String beginWord;
    private final String endWord;
    private final List<String> wordList;

    public WordLadderII(String beginWord, String endWord, List<String> wordList) {
        this.beginWord = beginWord;
        this.endWord = endWord;
        this.wordList = wordList;
    }

    public List<List<String>> solution() {
        List<List<String>> result = new ArrayList<>();
        Map<String, Set<String>> reverse = new HashMap<>();
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        Set<String> nextLevel = new HashSet<>();
        boolean findEnd = false;
        while (!queue.isEmpty()) {
            String word = queue.remove();
            for (String next : wordSet) {
                if (isLadder(word, next)) {
                    Set<String> reverseLadders = reverse.computeIfAbsent(next, k -> new HashSet<>());
                    reverseLadders.add(word);
                    if (endWord.equals(next)) {
                        findEnd = true;
                    }
                    nextLevel.add(next);
                }
            }
            if (queue.isEmpty()) {
                if (findEnd) {
                    break;
                }
                queue.addAll(nextLevel);
                wordSet.removeAll(nextLevel);
                nextLevel.clear();
            }
        }
        if (findEnd) {
            Set<String> path = new LinkedHashSet<>();
            path.add(endWord);
            findPath(endWord, beginWord, reverse, result, path);
        }
        return result;
    }

    private void findPath(
            String endWord,
            String beginWord,
            Map<String, Set<String>> graph,
            List<List<String>> result,
            Set<String> path
    ) {
        var next = graph.get(endWord);
        if (next != null) {
            for (String word : next) {
                path.add(word);
                if (beginWord.equals(word)) {
                    var shortestPath = new ArrayList<>(path);
                    Collections.reverse(shortestPath);
                    result.add(shortestPath);
                } else {
                    findPath(word, beginWord, graph, result, path);
                }
                path.remove(word);
            }
        }
    }

    private boolean isLadder(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return diff == 1;
    }

}
