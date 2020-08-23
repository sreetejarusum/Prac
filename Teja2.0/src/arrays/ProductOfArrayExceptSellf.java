package arrays;

public class ProductOfArrayExceptSellf {
	
	//Input Array-->1,2,3,4
	//Left Array -->1,1,2,6
	//Right Array-->24,12,4,1
	//ResultArray-->24,12,8,6
	public static int[] productArrayExceptSelfConstantSpace(int [] arr) {
		int [] result=new int[arr.length];
		
		result[0]=1;
		for(int i=1;i<result.length;i++) {
			result[i]=arr[i-1]*result[i-1];
		}
		
		int R=1;
		for(int i=arr.length-1;i>=0;i--) {
			result[i]=result[i]*R;
			R=R*arr[i];		
		}
		
		return result;
	}
	
	public static int[] productArr(int [] arr) {
		 int [] left=new int[arr.length];
		 int [] right=new int[arr.length];
		 int [] result=new int[arr.length];
		 
		 left[0]=right[arr.length-1]=1;
		 
		 for(int i=1;i<left.length;i++) {
			 left[i]=arr[i-1]*left[i-1];
		 }
		 
		 for(int i=right.length-2;i>=0;i--) {
			 right[i]=arr[i+1]*right[i+1];
		 }
		 
		 for(int i=0;i<result.length;i++) {
			 result[i]=left[i]*right[i];
		 }
		 
		 return result;
	}

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4};
		int [] result=productArr(arr);
//		int [] result1=productArrayExceptSelfConstantSpace(arr);
		
		for(int i=0;i<result.length;i++) {
			 System.out.print(result[i]+" ");
		 }
		
	/**	System.out.println("");
		
		for(int i=0;i<result1.length;i++) {
			 System.out.print(result1[i]+" ");
		 }
	**/
		
	}

}
