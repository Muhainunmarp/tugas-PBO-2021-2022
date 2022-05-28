import java.util.Scanner;

class Persegi {
	public int panjang;
	public int lebar;
	
	public Persegi() {}
	
	public Persegi(int sisi) {
		this.panjang = sisi;
		this.lebar = sisi;
	}
	
	public Persegi(int panjang, int lebar){
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	protected int luas(){
		return this.panjang * this.lebar;
	}
}

class Kotak extends Persegi{
	public int tinggi;
	
	public Kotak(int sisi){
		this.panjang = sisi;
		this.lebar = sisi;
		this.tinggi = sisi;
	}
	
	public Kotak(int panjang, int lebar, int tinggi){
		this.panjang = panjang;
		this.lebar =lebar;
		this.tinggi = tinggi;
	}
	
	public int volume(){
		return this.luas() * tinggi;
	}
}

class ContohTurunan2{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		
		int jenis_bidang = 0;
		
		while(true){
			System.out.print("1. persegi (datar) \n2. kotak (ruang)\nPilih jenis bidang: ");
			int input= scanner.nextInt();
			
			if(input == 1 || input == 2){
				jenis_bidang = input;
				break;
			}
		}
		
		boolean is_sama_sisi = false;
		
		while(true){
			System.out.print("1. Ya\n2. Tidak\nApakah sama sisi? ");
			int input = scanner.nextInt();
			
			if(input == 1 || input == 2){
				if (input == 1)
				is_sama_sisi = true;
				
				break;
			}
		}
		
		Persegi persegi;
		Kotak kotak;
		
		if(jenis_bidang == 1 && is_sama_sisi){
			System.out.print("masukan sisi: ");
			int sisi = scanner.nextInt();
			
			persegi = new Persegi(sisi);
			System.out.println("luas persegi adalah " + persegi.luas());
		}
		else if (jenis_bidang == 1){
			System.out.print("masukan panjang: ");
			int panjang = scanner.nextInt();
			System.out.print("masukan lebar: ");
			int lebar = scanner.nextInt();
			
			persegi = new Persegi(panjang, lebar);
			System.out.println("luas persegi panjang adalah " + persegi.luas());
		}
		else if(jenis_bidang == 2 && is_sama_sisi){
			System.out.print("masukan sisi: ");
			int sisi = scanner.nextInt();
			
			kotak = new Kotak(sisi);
			System.out.println("volume kubus adalah " + kotak.volume());
		}
		else{
			System.out.print("masukan panjang: ");
			int panjang = scanner.nextInt();
			System.out.print("masukan lebar: ");
			int lebar = scanner.nextInt();
			System.out.print("masukan tinggi: ");
			int tinggi = scanner.nextInt();
			
			kotak = new Kotak(panjang, lebar, tinggi);
			System.out.println("volume balok adalah " + kotak.volume());
		}
	}
}
