import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, j;
		final int TAM=10;
		int a [];
		int b[];
		
		a = new int [10];
		b = new int [10];
				for (i=0, j=9; i<10; i++, j--){
					System.out.println("digite os valores");
					a[i] = ler.nextInt();
				    b[j] = ler.nextInt();
				    
	}
      
        	System.out.println(a[i] +"ao contrario"+ b[j]);
 
        
        ler.close();
	}
}
