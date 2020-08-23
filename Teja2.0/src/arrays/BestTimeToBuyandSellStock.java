package arrays;

public class BestTimeToBuyandSellStock {
	
	public static int maxProfit(int [] arr) {
		int maxProfit=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else {
				maxProfit=Math.max(arr[i]-min,maxProfit);
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		
		int arr[]= {7,1,2,5,3,8,2,5};
		System.out.println(maxProfit(arr));

	}

}
