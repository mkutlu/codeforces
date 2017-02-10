import java.util.*;
public class CR396B {
	public static void main(String [] args){
		Scanner key = new Scanner (System.in);
		int a = key.nextInt();
		int [] array = new int[a];
		int [] tmp;
		for(int m=0;m<a;m++){
			array[m] = key.nextInt();
		}
		tmp = countingSort(array);
		for(int i=0;i<array.length-3;i++){
			
		}
	}
	public static int[] countingSort(int[] array){
		int max = array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>=max)
				max=array[i];
		}
		int[] countarray = new int[max+1];
		for(int j=0;j<array.length;j++){
			countarray[array[j]]++;
		}
		for(int k=0;k<max;k++){
			countarray[k+1]=countarray[k+1]+countarray[k];
		}
		int[] createdarray = new int[array.length+1];
		for(int d=0;d<array.length;d++){
			createdarray[countarray[array[d]]-1]=array[d];
			countarray[array[d]]--;
		}
		return createdarray;
	}
}
