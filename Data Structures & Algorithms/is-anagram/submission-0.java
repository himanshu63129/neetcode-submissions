class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String a1 = new String(s1);

        char[] s2 = t.toCharArray();
        Arrays.sort(s2);
        String a2 = new String(s2);

        int i=0;
        int j=0;
        while(i<a1.length()&& j<a2.length()){
            if(a1.charAt(i)!=a2.charAt(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    } 
}
