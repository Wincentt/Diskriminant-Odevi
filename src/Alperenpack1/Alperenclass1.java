package Alperenpack1;
import java.util.Scanner;
import java.lang.Math;
public class Alperenclass1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a Deðiþkenini Girin");
		int a = sc.nextInt();
		System.out.println("b Deðiþkenini Girin");
		int b = sc.nextInt();
		System.out.println("c Deðiþkenini Girin");
		int c = sc.nextInt();
		double delta=(b*b)-4*a*c;
		
		double kok1=(((-b)+(Math.sqrt(delta)))/2*a);
		double kok2=(((-b)-(Math.sqrt(delta)))/2*a);
		double koklertoplami=(-b)/a;
		double koklercarpimi=c/a;
							
									    	    
	   if (delta<0)
	   {
		   System.out.println("Denklemin Sanal Kökleri Vardýr.Reel Kökü Yoktur");
	   }
	   
	   else if (delta==0)
	   {
		   System.out.println("Çakýþýk 2 Kökü Vardýr."+"Denklemin Kökü= "+kok1);
	   }
	   
	   else
	   {
		   
		   System.out.println("2 Farklý Kökü Vardýr."+"Birinci Kök= "+kok1+"  "  +"Ýkinci Kök= "+kok2);
	   }
	   
	   if (delta<0)
	   {
		   System.out.println("Reel Kökü Olmadýðý Ýçin Kökler Toplamý Ve Kökler Çarpýmý Bulunamaz");
	   }
	   
	   else
	   {
		   System.out.println("Kökler Toplamý= "+ koklertoplami+" "+"Kökler Çarpýmý= "+koklercarpimi);
	   }
	   
	  

	   
	   
		
		
		
		

		
		
	}

}

