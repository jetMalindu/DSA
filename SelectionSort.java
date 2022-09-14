import java.util.*;
class SelectionSort{
	public static void main(String args[]){
		int[] number={8,5,2,9,5,6,3};
		System.out.println(Arrays.toString(number));
		for(int i=1;i<number.length;i++){
			int minValue=number[i];
			for(int j=i;j<number.length-i;j++){
				if(minValue>number[j+1]){
					minValue=number[j+1];
					
				}
			}
			int minIndex=i;
			for(int k=i;k<number.length-i;k++){
				if(number[k]==minValue){
					minIndex=k;
				}
			}
			if(minValue<number[i-1]){
				number[minIndex]=number[i-1];
				number[i-1]=minValue;
			}
			System.out.println(Arrays.toString(number));
		}
		System.out.println(Arrays.toString(number));
	}
}
