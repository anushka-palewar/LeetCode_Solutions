class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr1[ch-'a']++;
        }

        int k=s1.length();
        for(int i=0;i<k;i++){
            char ch=s2.charAt(i);
            arr2[ch-'a']++;
        }

        if(matches(arr1,arr2)) return true;

        for(int i=k;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr2[ch-'a']++;

            arr2[s2.charAt(i - k) - 'a']--;

            if(matches(arr1,arr2)) return true;
        }
        return false;
    }

    static boolean matches(int arr1[],int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}