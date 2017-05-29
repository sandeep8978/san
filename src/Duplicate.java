public class Duplicate {

	public static void main(String[] args) {
		int array[]={10,20,10,30};
		int size=array.length;
		System.out.println("size before deletion:"+size);
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(array[i]==array[j]){
					while(j<(size)-1){
						array[j]=array[j+1];
						j++;
					}
					size--;
				}
			}
		}
System.out.println("size after deletion:"+size);
for(int k=0;k<size;k++){
	System.out.println(array[k]);
}
	}

}
