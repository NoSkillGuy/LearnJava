public class UnreachableStatement{
	public static void main(String[] args){
		int i = 0;
		while(1==1){
			i += 1;
		}
		System.out.println("This statement never get executed");
	}
}