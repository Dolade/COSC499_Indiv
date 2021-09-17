package Default;
import java.util.*;

public class Array_Sort {

	public static void main(String[] args) {
		int[] nums = new int[20];
		int[] sortNums = new int[20];
		int upBound = 101;
		Random rand = new Random();
		int temp = 101;
		int idx = 0;
		
		for(int i = 0; i < 20; i++) {
			nums[i] = rand.nextInt(upBound);
			System.out.print(nums[i] + ", ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if(nums[j] < temp) {
					temp = nums[j];
					idx = j;
				}
			}
			
			sortNums[i] = temp;
			nums[idx] = 101;
			System.out.println(sortNums[i]);
			temp = 101;
		}
		
	}

}
