package Alperenpack1;
import java.util.Scanner;
import java.lang.Math;
public class Alperenclass1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a Değişkenini Girin");
		int a = sc.nextInt();
		System.out.println("b Değişkenini Girin");
		int b = sc.nextInt();
		System.out.println("c Değişkenini Girin");
		int c = sc.nextInt();
		double delta=(b*b)-4*a*c;
		
		double kok1=(((-b)+(Math.sqrt(delta)))/2*a);
		double kok2=(((-b)-(Math.sqrt(delta)))/2*a);
		double koklertoplami=(-b)/a;
		double koklercarpimi=c/a;
							
									    	    
	   if (delta<0)
	   {
		   System.out.println("Denklemin Sanal Kökleri Vardır.Reel Kökü Yoktur");
	   }
	   
	   else if (delta==0)
	   {
		   System.out.println("Çakışık 2 Kökü Vardır."+"Denklemin Kökü= "+kok1);
	   }
	   
	   else
	   {
		   
		   System.out.println("2 Farklı Kökü Vardır."+"Birinci Kök= "+kok1+"  "  +"İkinci Kök= "+kok2);
	   }
	   
	   if (delta<0)
	   {
		   System.out.println("Reel Kökü Olmadığı İçin Kökler Toplamı Ve Kökler Çarpımı Bulunamaz");
	   }
	   
	   else
	   {
		   System.out.println("Kökler Toplamı= "+ koklertoplami+" "+"Kökler Çarpımı= "+koklercarpimi);
	   }
	   
	  

	   
	   
		
		
		
		

		
		
	}

}

