
public class UsoEccc {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		// misuso ecc
		for(int i = 0; ; i++){
			try{
				System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				break;
			}
		}
	}
	
}
