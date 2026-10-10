class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        // if(m!=n) return false;
        // int count=0;
        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(s.charAt(i)==t.charAt(j)) count++;
        //     }

        // }
        // return (count==m) ? true:false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) +1);
        }
        for(int i=0;i<n;i++)
        {
            char ch=t.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);
        }
        return map.isEmpty();
    }
}
