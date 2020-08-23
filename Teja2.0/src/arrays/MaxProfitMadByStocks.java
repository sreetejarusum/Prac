package arrays;

public class MaxProfitMadByStocks {
	/*
	 * Given an array having stock price on day i, Find the the max profit which 
	 * can be made , provided the buying and selling is allowed any number of times,
	 * one can not sell stock without buying.
	 */

	public static int getMaxProfit(int[] arr) {
		
		if(arr==null || arr.length==0) {
			return 0;
		}
		int profit=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				profit+=arr[i+1]-arr[i];
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {7,1,2,5,3,8,2,5};
		System.out.println(getMaxProfit(arr));
	}

}
