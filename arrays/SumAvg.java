public class SumAvg{
	public static void main(String[] args) {
		int[] nums = { 5, 10, 15, 20, 25 };
		int sum = 0;
		for(int i = 0; i < nums.length; i++){
			sum += nums[i];
		}
		System.out.println(sum);

		int avg = sum/nums.length;
		System.out.println(avg);
	}
}