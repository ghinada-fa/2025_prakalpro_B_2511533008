package tugaspekan2;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		 float nilaimatematika = 99.6f;
		 int nilaifisika = 90;
		 float ratarata;
		 char kategori = 'A';
		 boolean lulus = true;
		 
		 ratarata = (nilaimatematika + nilaifisika)/2;
		 
		 System.out.println("Nilai Matematika : " + nilaimatematika);
		 System.out.println("Nilai Fisika : " + nilaifisika);
		 System.out.println("Rata Rata : " + ratarata);
		 System.out.println("Kategori : " + kategori);
		 System.out.println("Status Kelulusan: " + (lulus ? "Lulus" : "Tidak Lulus"));
		 
	}

}
