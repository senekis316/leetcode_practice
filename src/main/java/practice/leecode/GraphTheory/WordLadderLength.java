package practice.leecode.GraphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class WordLadderLength {

    private int minPathLength = 0;

    private Map<String, Integer> distanceCache = new HashMap<>();

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        minPathLength = 0;

        if (beginWord.length() != endWord.length()) {
            return 0;
        }

        getMinPathLength(beginWord, endWord, wordList,  new ArrayList<String>());

        return minPathLength > 0 ? minPathLength + 1 : minPathLength;

    }

    private void getMinPathLength(String currentWord, String targetWord, List<String> wordList, List<String> pathList) {

        if (wordList.size() == 0) {
            return;
        }

        if (minPathLength != 0 && (pathList.size() >= minPathLength || pathList.size() + getDistanceCache(currentWord, targetWord) >= minPathLength)) {
            return;
        }

        List<String> adjacentWordList = getAdjacentWordList(currentWord, wordList);

        if (adjacentWordList.size() == 0) {
            return;
        }

        if (adjacentWordList.contains(targetWord)) {
            minPathLength = minPathLength == 0 ? pathList.size() + 1 : Math.min(minPathLength, pathList.size() + 1);
            setDistanceCache(targetWord, pathList);
            return;
        }

        for (String adjacentWord : adjacentWordList) {
            List<String> optionWordList = wordList.stream().filter(word -> !word.equals(currentWord) && !word.equals(adjacentWord)).collect(Collectors.toList());
            pathList.add(adjacentWord);
            getMinPathLength(adjacentWord, targetWord, optionWordList, pathList);
            pathList.remove(pathList.size() - 1);
        }

    }

    private int getDistanceCache(String currentWord, String targetWord) {
        Integer distance = distanceCache.get(currentWord + targetWord);
        return distance == null ? 0 : distance;
    }

    private void setDistanceCache(String targetWord, List<String> pathList) {
        for (int i = 0, j = pathList.size(); i < pathList.size() - 1; i++, j--) {
            String currentWord = pathList.get(i);
            setDistanceCache(currentWord, targetWord, j);
        }
    }

    private void setDistanceCache(String currentWord, String targetWord, int distance) {
        setDistanceCache(currentWord + targetWord, distance);
    }

    private void setDistanceCache(String key, int distance) {
        if (distanceCache.get(key) == null || distanceCache.get(key) > distance) {
            distanceCache.put(key, distance);
        }
    }

    private List<String> getAdjacentWordList(String word, List<String> wordList) {
        List<String> adjacentWordList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            if (isAdjacent(word, wordList.get(i))) {
                adjacentWordList.add(wordList.get(i));
            }
        }
        return adjacentWordList;
    }

    private boolean isAdjacent(String word1, String word2) {
        if (getWordDistance(word1, word2) == 1) {
            return true;
        }
        return false;
    }

    private Integer getWordDistance(String word1, String word2) {
        return getWordDistance(word1.toCharArray(), word2.toCharArray());
    }

    private Integer getWordDistance(char[] chars1, char[] chars2) {
        int distance = 0;
        for (int i=0; i<chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                distance++;
            }
        }
        return distance;
    }

                /*List<String> optionWordList = new ArrayList<>();
            for (int i = 0; i < wordList.size(); i++) {
                String word = wordList.get(i);
                if (!word.equals(currentWord) && !word.equals(adjacentWord)) {
                    optionWordList.add(word);
                }
            }*/

}
