import java.util.Scanner;
public class TahunKabisat {
    public static void main(String[]args){
        int n,hasil;
	
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Dea Tresna N");
		System.out.println("1127050030");
		System.out.println(" ");
		System.out.println(" ");
		
        Scanner scan=new Scanner(System.in);
        System.out.print("Masukkan tahun dari[1900-2020]:");
        n=scan.nextInt();
		if(n%4==0)
		{System.out.println("Tahun Kabisat");}
		else{System.out.println("Bukan Tahun Kabisat");}
            }
}