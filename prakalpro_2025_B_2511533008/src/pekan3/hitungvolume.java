package pekan3;
import java.util.Scanner;
public class hitungvolume {

	public static void main(String[] args) {
		int jarijari,tinggi;
		float phi = 3.14f,volume;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Masukkan jari-jari tabung : ");
		jarijari = keyboard.nextInt();
		System.out.print("Masukkan tinggi tabung : ");
		tinggi = keyboard.nextInt();
		keyboard.close();
		volume = jarijari * jarijari * phi * tinggi;
		System.out.println("Volume tabung : " + volume);
		
	}

}
