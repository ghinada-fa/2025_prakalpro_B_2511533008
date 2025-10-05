package tugas;
import java.util.Scanner;
public class tiketbioskop {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("Nama Pembeli : ");
		String nama = a.nextLine();
		
		System.out.print("Jumlah Tiket : ");
		int jumlahtiket = a.nextInt();
		
		System.out.print("Pilih Hari (1=senin-kamis, 2=jumat, 3=sabtu-minngu) : ");
		int hari = a.nextInt();
		
		System.out.print("Pilih waktu tayang (1=pagi, 2=siang, 3=malam) : ");
		int waktu = a.nextInt();
		
		System.out.print("Pilih jenis studio (1=reguler, 2=deluxe, 3=premium) : ");
		int studio = a.nextInt();
		
		int hargadasar = 0;
		String jenisstudio = "";
		switch (studio) {
		case 1:
			hargadasar = 30000;
			jenisstudio = "reguler";
			break;
		case 2:
			hargadasar = 50000;
			jenisstudio = "deluxe";
			break;
		case 3:
			hargadasar = 80000;
			jenisstudio = "premium";
			break;
		default:
			System.out.println("Input studio tidak valid");
			return; }
		
		double biayahari = 0;
		String kethari = "";
		if (hari == 1) {
			biayahari = 0;
			kethari = "senin-kamis";
		} else if (hari == 2) {
			biayahari = 0.10;
			kethari = "jumat";
		} else if (hari == 3) {
			biayahari = 0.30;
			kethari = "sabtu-minggu";
		} else {
			System.out.println("Input hari tidak valid ");		
			return; }
		
		double biayawaktu = 0;
		String ketwaktu = "";
		if (waktu == 1) {
			biayawaktu = 0;
			ketwaktu = "pagi";
		} else if (waktu == 2) {
			biayawaktu = 0.10;
			ketwaktu = "siang";
		} else if (waktu == 3) {
			biayawaktu = 0.20;
			ketwaktu = "malam";
		} else {
			System.out.println("Input waktu tidak valid");
		    return; }
		
		double hargapertiket = hargadasar + (hargadasar * biayahari) + (hargadasar * biayawaktu);
		double totalharga = hargapertiket * jumlahtiket;
		double diskon = (jumlahtiket >= 5)? totalharga * 0.20 : 0;
		
		double totalbayar = totalharga - diskon;
		
		System.out.println("\n====== PEMBELIAN TIKET BIOSKOP =====");
		System.out.println("Nama Pembeli     : " + nama);
		System.out.println("Jumlah Tiket     : " + jumlahtiket);
		System.out.println("Hari             : " + kethari);
		System.out.println("Waktu Tayang     : " + ketwaktu);
		System.out.println("Jenis Studio     : " + jenisstudio);
		System.out.println("---------------------------------------");
		System.out.println("Harga Dasar      : Rp " + hargadasar + "/tiket");
		System.out.println("Biaya Hari       : + " + (biayahari * 100) + "%");
		System.out.println("Biaya Waktu      : + " + (biayawaktu * 100) + "%" );
		System.out.println("Harga Per Tiket  : Rp " + (int)hargapertiket);
		System.out.println("Total Harga      : Rp " + (int)totalharga);
		System.out.println("Diskon (20%)     : Rp " + (int)diskon);
		System.out.println("---------------------------------------");
		System.out.println("TOTAL BAYAR      : Rp " + (int)totalbayar);
	}

}
