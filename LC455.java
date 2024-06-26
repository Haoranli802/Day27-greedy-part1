class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int index = s.length - 1;
        for(int i = g.length - 1; i >= 0; i--){
            if(index >= 0 && s[index] >= g[i]){
                count++;
                index --;
            }
        }
        return count;
    }
}
// O(mlogm + nlogn)
// O(logm + logn)
