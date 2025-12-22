class Solution {
    public int myAtoi(String s) {
        String sb=s.trim();
        if (sb.length() == 0) return 0;
        int i=0;
        boolean pos=true;
        if(sb.charAt(0)=='-'){
            pos=false;
            i++;
        }else if(sb.charAt(0)=='+'){
            i++;
        }

        int no=0;
        for(;i<sb.length();i++){
            char ch=sb.charAt(i);

            if(!(ch>='0' && ch<='9')) break;
            if (no > Integer.MAX_VALUE / 10 ||
               (no == Integer.MAX_VALUE / 10 && ch > '7')) {
                return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            no = no * 10 + (ch - '0');
        }

        return pos ? no : -no;
    }
}