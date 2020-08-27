/*       LARGEST  AND SMALLEST ELEMENT IN THE ARRAY		
		SUM OF THE ARRAY ELEMENT
*/


public class element{
    public static void main(String args[]){
      int arr[] = new int[]{12,4,9,-1,18,4 };
	int i, sum = 0;
	int max = arr[0];
	int min = arr[0];
	for(i=0; i < arr.length; i++){
		if(arr[i]>max)
			max= arr[i];
		if(arr[i]<min)
			min=arr[i];
		}
		System.out.println("maximum= " + max + ", minimum =" + min);
		for(i=0; i< arr.length; i++){
			sum = sum + arr[i];
		}
		System.out.println("Sum= "+ sum);
	}
}	