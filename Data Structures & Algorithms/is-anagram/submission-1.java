class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // char[] s1 = s.toCharArray();
        // Arrays.sort(s1);
        // String a1 = new String(s1);

        // char[] s2 = t.toCharArray();
        // Arrays.sort(s2);
        // String a2 = new String(s2);

        // int i=0;
        // int j=0;
        // while(i<a1.length()&& j<a2.length()){
        //     if(a1.charAt(i)!=a2.charAt(j)){
        //         return false;
        //     }
        //     i++;
        //     j++;
        // }
        // return true;


        //using arraylist
        ArrayList<Character> a1 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            a1.add(s.charAt(i));
        }
        ArrayList<Character> a2 = new ArrayList<>();
        for(int j=0;j<t.length();j++){
            a2.add(t.charAt(j));
        }
        Collections.sort(a1);
        Collections.sort(a2);
        int p=0;
        int q=0;
        while(p<a1.size()&& q<a2.size()){
            if(!a1.get(p).equals(a2.get(q))){
                return false;
            }
            p++;
            q++;
        }
        return true;
    } 
}
