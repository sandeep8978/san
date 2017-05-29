
public class HighLow {

	public static void main(String[] args) {
		int numbers[] =new int[]{55,32,45,98,82,11,9,39,50};
		int smallnumber=numbers[0];
		int largenumber=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largenumber)
			largenumber=numbers[i];
			else if(numbers[i]<smallnumber);
			smallnumber=numbers[i];
			System.out.println("larget number:"+largenumber);
			System.out.println("small number:"+smallnumber);
				
		}
		
		

	}

}
