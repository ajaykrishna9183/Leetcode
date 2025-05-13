class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum>maxi)
            {
                maxi=sum;
            }

            if(sum<0)
            {
                sum=0;
            }
           
            // maxi = Math.max(sum,maxi);
        }
        return maxi;

        
        
        
    }
}

 // Brutforce Approach
    //     for(int i=0; i<nums.length;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++)
    //         {
                
    //             sum=sum+nums[j];
                
    //             maxi = Math.max(maxi, sum);
    //         }
    //     }

    // return maxi;
