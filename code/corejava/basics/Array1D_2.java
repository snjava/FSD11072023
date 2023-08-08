public class Array1D_2 {
	public static void main(String args[]) {
		int arr[] = {234,54,76,78,658,43,325,456,658,856,43,23};
		System.out.println(arr.length);
		System.out.println(arr.length-1); // 11
		System.out.println("-----------------------");
		
		for(int i =0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("-----------------------");
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
}