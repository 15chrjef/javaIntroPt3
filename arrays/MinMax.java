public class MinMax{
	public static void main(String[] args){
		int[] nums = { 20, 4, 33, 101, 14, 76 };

		int currMax = nums[0];
		int currMin = nums[0];
		

		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > currMax){
				currMax = nums[i];
			}
			if(nums[i] < currMin){
				currMin = nums[i];
			}
		}
		System.out.println(currMax);
		System.out.println(currMin);
	}
}