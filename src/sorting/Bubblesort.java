package sorting;

// in bubblesort swaping for all elements 
public class Bubblesort {
public static void main(String[] args) {
	int array[]= {2,1,3,3,7,4,1};
	
	for(int i=0;i<=array.length-1;i++) {
		for(int j=array.length-1 ;j > 0+i ; j--) {
//		System.out.println(array[j] + " "+ array[j-1]);
			if(array[j] < array[j-1] ) 
			{
				int temp = array[j];
				array[j]= array[j-1];
				array[j-1]= temp;
			}
		}
		
	}
	for(int u=0;u<= array.length-1;u++) {
		System.out.println(array[u]);
	}
}
}
