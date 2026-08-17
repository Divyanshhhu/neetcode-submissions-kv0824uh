class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hmm=new HashMap<>();
        char[] sh=s.toCharArray();
        char[] th=t.toCharArray();
        for(char i:sh){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(char i:th){
            hmm.put(i,hmm.getOrDefault(i,0)+1);
        }

         boolean isIdentical = hm.equals(hmm);

         return isIdentical;
    }
}
