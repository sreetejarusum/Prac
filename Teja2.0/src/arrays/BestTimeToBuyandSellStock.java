package arrays;

public class BestTimeToBuyandSellStock {
	/*
	 * Given an array having stock price on day i, Find the the max profit which 
	 * can be made , provided the buying and selling is allowed only once, one can not sell
	 * stock without buying.
	 * 
	 */
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
