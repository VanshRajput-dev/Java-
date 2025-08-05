 class  consicutive {
    public static void main(String[] args) {
        int [] nums = {0,1,1,1,1,0,1,1};
        int n = nums.length;
        int count = 0;
        int maxCount = 0;
        
        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                count++;
                if(count > maxCount){
                    maxCount++;
            }}
            else if(nums[i] == 0){
                count  = 0;
            }
            
        }
        
    System.out.print(maxCount);
           }
}