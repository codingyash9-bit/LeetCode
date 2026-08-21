class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            int[] letters = new int[26];

            for(int i=0 ; i<str.length() ; i++){
                letters[str.charAt(i) - 'a']++;
            }

            String key = "";

            for(int i=0 ; i<letters.length ; i++){
                key += letters[i]+'#';
            }

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}