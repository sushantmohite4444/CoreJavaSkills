package sorting;

public class Recurdionexample5 {
	
		public static boolean find(int arr[],int index){
			if(index == arr.length-1){
			return true;
			}
			
			if(arr[index] > arr[index +1]){
			 return find(arr,index+1);
			}
			else
			{
			return false;
			}
			
			
			
		}
		public static void main(String args[]){
		int arr[]={10,0,8,7};
		int index=0;
			boolean tr=find(arr,index);
			System.out.println(tr);
		}
		}

