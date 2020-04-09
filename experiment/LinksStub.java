import java.util.ArrayList;
public class LinksStub {
	public static Links llAdd(int size){
		long startTime = System.nanoTime();
		Links link = new Links();
		for (int i=0; i < size; i++){
			link.add(i);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("ll total add time:" + totalTime);
		return link;
	}
	public static Links llRemove(Links link, int size){
		long startTime = System.nanoTime();
		for (int i=0; i < size; i++){
			link.remove(0);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("ll total remove time:" + totalTime);
		return link;
	}
	public static void llGet(Links link, int size){
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i=0; i < size; i++){
			sum += link.get(i);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("ll total get time:" + totalTime);
	}
	public static ArrayList<Integer> arlAdd(int size){
		long startTime = System.nanoTime();
		ArrayList<Integer> array_list = new ArrayList<Integer>();
		for (int i =0; i < size; i++){
			array_list.add(i);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("arl total add time:" + totalTime);
		return array_list;
	}
	public static ArrayList<Integer> arlRemove(ArrayList<Integer> array_list, int size){
		long startTime = System.nanoTime();
		for (int i =0; i < size; i++){
			array_list.remove(0);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("arl total remove time:" + totalTime);
		return array_list;
	}
	public static void arlGet(ArrayList<Integer> array_list, int size){
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i =0; i < size; i++){
			sum += array_list.get(i);
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("arl total get time:" + totalTime);
	
	}
	public static int[] arrAdd(int size){
		long startTime = System.nanoTime();
		int[] arr = new int[size];
		for (int i =0; i < size; i++){
			arr[i] = i;
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("arr total add time:" + totalTime);
		return arr;
	}
	public static int[] darrAdd(int size){
		long startTime = System.nanoTime();
		int cap = 10;
		int[] arr = new int[cap];
		for (int i =0; i < size; i++){
			if (i < cap){
				arr[i] = i;	
			}
			else{
				cap = cap + (cap/2) + 1;
				if (cap > size)
					cap = size;
				int[] temp = new int[cap];
				for (int j =0; j < arr.length; j++){
					temp[j] = arr[j];
				}
				arr = new int[cap];
				arr = temp;
				arr[i] = i;		
			}
			
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("darr total add time:" + totalTime);
		return arr;
	}
	public static void arrGet(int[] array){
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i =0; i < array.length; i++){
			sum += array[i];
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("arr total get time:" + totalTime);
	}
	public static void darrGet(int[] array){
		long startTime = System.nanoTime();
		int sum = 0;
		for (int i =0; i < array.length; i++){
			sum += array[i];
		}
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("darr total get time:" + totalTime);
	}

	public static void main(String args[]) {
		int sizeof_list = 100000;
		
		System.out.println("--------------------------------------------------------");
		Links link = llAdd(sizeof_list);
		ArrayList<Integer> array_list = arlAdd(sizeof_list);
		int[] arr1 = arrAdd(sizeof_list);
		int[] arr2 = darrAdd(sizeof_list);
		System.out.println("--------------------------------------------------------");
		System.out.println("SIZE:" + link.size() + "\t" + array_list.size());
		System.out.println("--------------------------------------------------------");
		
		llGet(link, sizeof_list);
		arlGet(array_list, sizeof_list);
		arrGet(arr1);
		darrGet(arr2);
		System.out.println("--------------------------------------------------------");

		link = llRemove(link, sizeof_list);
		array_list = arlRemove(array_list, sizeof_list);
		System.out.println("--------------------------------------------------------");
		System.out.println("SIZE:" + link.size() + "\t" + array_list.size());
		System.out.println("--------------------------------------------------------");
		
	} 

} // experiments
