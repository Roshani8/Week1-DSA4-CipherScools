
public class kSmallestElements {
	public static void keElements(int []arr, int k) {
		for(int index = k; index<arr.length; index++) { 
			int currentElement = arr[k];
			int max = arr[k-1];
			int maxPosition = k-1;
			int reverseIndex;
			for(int reversIndex = k-2; reverseIndex >=0; reverseIndex--) {
				if(arr[reverseIndex] > max) {
					max = arr[reverseIndex];
					maxPosition = reverseIndex;
				}
			}
			if(currentElement < max) {
				while(maxPosition < k-1) {
				arr[maxPosition] = arr[maxPosition +1];
				maxPosition++;
				}
				arr[k-1] = currentElement;
		}
	}
		for(int i = 0; i < k; i++) {
			System.out.println(arr[k] + " ");
	}
}
public static void main(String[] args) {
	int [] arr = {50,25,100,200,30};
	kElements(arr, k 2);
	
	
	
			int max = arr[k-1];
			for()
		}
	}

}
