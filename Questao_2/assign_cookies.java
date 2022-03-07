class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
            
        int count_1 = 0;
        int count_2 = 0;
        
        while(count_1 < g.length && count_2 < s.length){
            if(g[count_1] <= s[count_2]){
                count_1++;
                count_2++;
            }
            else{
                count_2++;
            }
        }
        
        return count_1;
    }
}