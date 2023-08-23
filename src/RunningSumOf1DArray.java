public class RunningSumOf1DArray {
    public int[] runningSum(int[] nums){
        int[] results = new int[nums.length];//the results array is the same length as the num array
        results[0] = nums[0];//the number in position 0 of nums array is the same as the number in position 0 of results array

        for(int i= 1; i<nums.length; i++){ //start from index 1
            results[i] = nums[i]+ results[i-1];//the number in position 'i' is equal to the number in position i of the num array along with the number of i-1 of results array
            //for example num[i] = 1 and results[i-1] = the result of previous addition so lets say 3
            //3+1

        }
        return results;//return the results
    }

    public static void main(String[] args) {
        RunningSumOf1DArray solution = new RunningSumOf1DArray();//create new object
        int[] nums = {1,2,3,4,5};//initialise the nums array
        int[] runningSums = solution.runningSum(nums);//call the method

        //print the running sums
        for (int sum : runningSums){ //for each loop where it iterates through elements of runningSums
            System.out.println(sum + " " );//print out the array
        }
    }
}
