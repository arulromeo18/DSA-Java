class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        int j=0;
        for(int n:nums){
            ans[j]=n;
            j++;
        }
        for(int n:nums){
            ans[j]=n;
            j++;
        }
        return ans;
    }
}
