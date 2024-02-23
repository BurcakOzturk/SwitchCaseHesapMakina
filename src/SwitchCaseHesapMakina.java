import java.util.Scanner;
public class SwitchCaseHesapMakina {

	public static void main(String[] args) {

    int n1,n2,islem;
 
    Scanner input = new Scanner(System.in);
        
    System.out.print("İlk sayıyı giriniz : ");
	n1 = input.nextInt();
	
	System.out.print("İkinci sayıyı giriniz : ");
	n2 = input.nextInt();
	
	System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
	System.out.print("seciminiz : ");
	
	islem=input.nextInt();
	
	switch (islem) {
	
	case 1: 
		System.out.println("Toplama işlemin sonucu : "+(n1+n2));
		break;
	
	case 2:
		System.out.println("cıkarma işlemin sonucu : "+(n1-n2));
		break;	
	
	case 3: 
		System.out.println("carpma işlemin sonucu : "+(n1*n2));
		break;
		
	case 4:
		System.out.println("bölme işlemin sonucu : "+(n1/n2));
		break;
    }

}
}
