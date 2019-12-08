public class LongestPalindromicSubstring {
    /*给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
    * */
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String maxString = "";
        for(int i = 0;i <= chars.length-1;i++){
            for (int j = chars.length-1;j >= i ;j--){
                String flag = compare(i,j,chars);
                if (flag.length() >= maxString.length()){
                    maxString = flag;
                }
            }
        }
        return maxString;
    }
    public String compare(int starIndex,int endIndex,char[] s){
        boolean flag = true;
        StringBuffer sb =  new StringBuffer();
        for (int i = starIndex,j = endIndex;i < j;i++,j--){
            if (s[i] != s[j]){
                flag = false;
                break;
            }
            sb.append(s[i]);
        }
        if (flag == true){
            return String.valueOf(sb);
        }else {
            return "";
        }
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println(l.longestPalindrome("babad"));
    }

}
