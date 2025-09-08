package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makeBatter();
		memanggang();
		memanggang();
		menghias();
		
	}
// langkah 1: Buat adonan kue.
	public static void makeBatter() {
		System.out.println("Campur bahan kering.");
		System.out.println("Krim mentega dan gula.");
		System.out.println("Kocok telurnya.");
		System.out.println("Masukkan bahan kering.");
	}
//langkah 2: Panggang sekumpulan kue.
	public static void memanggang() {
		System.out.println("Setel suhu oven.");
		System.out.println("Setel pengaturan waktu.");
		System.out.println("Masukkan kue ke dalam oven.");
		System.out.println("Biarkan cookie untuk dipanggang.");
	}
// langkah 3: Hiasi cookie.
	public static void menghias() {
		System.out.println("Campur bahan untuk frosting.");
		System.out.println("Taburkan frosting dan taburan.");
	}
}
