class Solution {
    public int arrayPairSum(int[] nums) {
        //Sort the array

        Arrays.sort(nums);

        //store the sum = 0
        int sum=0;

        for (int i=0; i<nums.length; i+=2){
            sum =sum + nums[i];
        }

        return sum;
    }
}