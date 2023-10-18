package sorting;
//one swap per one iteration
public class selectionsort {

	public static void main(String[] args) {
		int arr[] ={10,5,2,6,7,3,4,9,1};
		for(int i=0;i <arr.length-1;i++) {
			int smallest=i;
			int j ;
			for( j=i+1;j<arr.length;j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
					}
		for(int u=0;u<= arr.length-1;u++) {
			System.out.println(arr[u]);
		}
	}
}
