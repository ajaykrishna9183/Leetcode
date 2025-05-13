class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0,p=0,n=0;
        List<Integer> p1 = new ArrayList<>();
        List<Integer> n1 = new ArrayList<>();
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
            p1.add(nums[i]);
            }
            if(nums[i]<0)
            {
            n1.add(nums[i]);
            }
        }
        // while(j<nums.length){
        // result[j++] = p1.get(p++);
        // result[j++] = n1.get(n++);
        // }
        for(j=0;j<nums.length/2;j++)
        {
            result[2*j] = p1.get(p++);
            result[2*j+1] = n1.get(n++);
        }

    return result;

        
    }
}