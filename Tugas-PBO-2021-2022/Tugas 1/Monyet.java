class Monyet {
	private static String jenis_hewan = "monyet";
	private static int jumlah_kaki = 2;
	public static String getJenisHewan() {
		return jenis_hewan;
	}
	
	public static int getJumlahKaki(){
		return jumlah_kaki;
	}
	
	private static void memanjat() {
		System.out.println("aku memanjat");
	}
	
	private static void bergantung() {
		System.out.println("aku bergantung");
	}
	
	private static void berbulu() {
		System.out.println("aku berbulu");
	}
	
	public static void main(String[]args) {
		System.out.println(String.format("jenis hewan: %s", getJenisHewan()));
		
		System.out.println(String.format("jumlah kaki: %s", getJumlahKaki()));
		
		memanjat();
		bergantung();
		berbulu();
	}
}

