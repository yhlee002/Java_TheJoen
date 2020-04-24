package MyHomeWork200407;

public class MyHomeWork3 {
	int[] nums;
	int sum;
	
	public void createArray() {
		int i=0;
		int j=0;
		nums = new int[10]; //이때 10(배열이 가질 원소 수)는 예측해서 넣어야 하는 것?
		for(i=0; i<20; i++) {
			if((i+1)%2 != 0) {
				nums[j] = i+1;
				j++;
			}
		}
	}
	public void sum() {
		int sum = 0;
		for(int key = 0; key < nums.length; key++) {
			sum += nums[key];
		}
		this.sum = sum;
	}
	public int[] getNums() {
		return nums;
	}
	public int getSum() {
		return sum;
	}

}

