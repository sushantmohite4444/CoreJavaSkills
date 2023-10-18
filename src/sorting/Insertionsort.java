package sorting;

public class Insertionsort {

	public static void main(String[] args) {
		int arr[]= {1,6,3,7,9,5};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i ;j<0;j--) {
//				if(arr[i+1]<arr[j]) {
//					int temp =arr[j];
//					arr[j]=arr[j-1];
//					arr[j-1]=temp;
//				}
//			}
//		}
		
		for (int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
		while (j >=0 && current < arr[j]) 
		{
			arr[j+1]=arr[j];
			j--;
		}
			arr[j+1]=current;
		}
		for(int u=0;u<= arr.length-1;u++) {
			System.out.println(arr[u]);
		}
	}

}
