package Hafta02;

import java.util.Scanner;

//kullan�c�dan 2 say� al
//say�n�n get ve set metotlar�n� olu�tur
//say�lar�n 4 i�lem metotlar�n� olu�tur
//sonu�lar� yazd�r metotu ile ekrana yazd�r
//t�rk�e karakter ve b�y�k k���k uyumlar�na dikkat
class DortIslem0{
	double a,b;
	double sonuc;
	public void setSayi(double a,double b){
		this.a=a;
		this.b=b;
		
		
	}
	public double Toplama(double a, double b){
		sonuc=a+b;
		return sonuc;
	}
	public double Cikarma(double a,double b){
		sonuc = a-b;
		return sonuc;
	}
	public double Carpma(double a,double b){
		sonuc = a*b;
		return sonuc;
	}
	public double Bolme(double a,double b)
	{
		sonuc = a/b;
		return sonuc;
	}
	public void getSonuc(){
		System.out.println("��lemin sonucu: "+sonuc);
	}
}
public class Ornek01_Calisma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DortIslem0 Toplat=new DortIslem0();
System.out.println("�lk say�y� giriniz.");
Scanner input1=new Scanner(System.in);
double a=input1.nextDouble();
System.out.println("�kinci say�y� giriniz.");
double b=input1.nextDouble();

Toplat.Toplama(a,b);
Toplat.getSonuc();
Toplat.Cikarma(a, b);
Toplat.getSonuc();
Toplat.Carpma(a, b);
Toplat.getSonuc();
Toplat.Bolme(a, b);
Toplat.getSonuc();
	}

}
