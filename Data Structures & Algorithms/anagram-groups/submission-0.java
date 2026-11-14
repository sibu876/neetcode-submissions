class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String key = new String(word);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        for(String word: map.keySet()){
            list.add(map.get(word));
        }
        return list;
    }
}
