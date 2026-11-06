
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {
                sb.append(ch);
            }
        }

        char arr[] = sb.toString().toCharArray();

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return sb.toString().equals(new String(arr));
    }
}
