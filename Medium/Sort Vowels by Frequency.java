class Solution {
    public String sortVowels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> firstIndex = new HashMap<>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                map.put(c, map.getOrDefault(c, 0) + 1);
                firstIndex.putIfAbsent(c, i);
            }
        }

        List<Map.Entry<Character, Integer>> temp = new ArrayList<>(map.entrySet());

        temp.sort((a, b) -> {
            if (!b.getValue().equals(a.getValue())) {
                return b.getValue().compareTo(a.getValue());
            }
            return firstIndex.get(a.getKey()) - firstIndex.get(b.getKey());
        });

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : temp) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        String t = "";
        String z = "";

        for (char c : sortedMap.keySet()) {
            int freq = sortedMap.get(c);
            for (int i = 1; i <= freq; i++) {
                t += c;
            }
        }

        System.out.println(t);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                z += t.charAt(j);
                j++;
            } else {
                z += s.charAt(i);
            }
        }

        return z;
    }
}
