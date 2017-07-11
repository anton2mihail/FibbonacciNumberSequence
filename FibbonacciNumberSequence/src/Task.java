import java.util.ArrayList;
public class Task {
	@SuppressWarnings("unchecked")
	public static <e> ArrayList<e> fibbo(){
	int counter = 0;
	ArrayList<Integer> fibbonacci = new ArrayList<Integer>();
	Numbers numbers = new Numbers();
	int start = numbers.start();
	fibbonacci.add(start);
	start = numbers.sum(start,start+1);
	fibbonacci.add(start);
		while(counter < 14){
		fibbonacci.add(numbers.sum(fibbonacci.get(counter), fibbonacci.get(counter+1)));	
		counter++;	
		}
		for(int item : fibbonacci){
			System.out.println(item);	
		}
			return (ArrayList<e>) fibbonacci;
		}
	public static void main(String[] args){
		fibbo();
	}	
}

