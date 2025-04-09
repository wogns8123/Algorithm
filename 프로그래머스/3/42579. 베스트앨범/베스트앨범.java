import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayCount = new HashMap<>();
        Map<String, List<int[]>> genreToSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);

            genreToSongs.putIfAbsent(genres[i], new ArrayList<>());
            genreToSongs.get(genres[i]).add(new int[]{i, plays[i]});
        }

        // 장르 정렬 (재생 수 내림차순)
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));

        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> songs = genreToSongs.get(genre);

            // 노래 정렬 (재생 수 내림차순, 같으면 인덱스 오름차순)
            songs.sort((a, b) -> {
                if (b[1] == a[1]) return a[0] - b[0];
                return b[1] - a[1];
            });

            // 최대 2곡 선택
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i)[0]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}