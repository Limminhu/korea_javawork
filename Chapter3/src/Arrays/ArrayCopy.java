package Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40};
		int[] arr2 = new int[4];
		
		System.out.println();
		for(int i = 0;i < arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(int i = 0;i < arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
