package tugaspekan2;

import java.util.Scanner;

public class TugasAlproPekan2 {
	public static void main(String[] args) {
		String NIM,nama;
		int umur;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("=== Data Mahasiswa ===");
		System.out.print("NIM : ");
		NIM = keyboard.nextLine();
		
		System.out.print("Nama: ");
		nama = keyboard.nextLine();
		
		System.out.print("Umur: ");
		umur = keyboard.nextInt();
		
		String umurStr = Integer.toString(umur);
		Long NIMLong = Long.parseLong(NIM);
		Long hasilpenjumlahan = NIMLong + umur;
		
		
		System.out.println("=== Data Mahasiswa ===");
		System.out.println("NIM  : " + NIM);
		System.out.println("Nama : " + nama);
		System.out.println("Umur : " + umur + " tahun");
		System.out.println("NIM + Umur : " + hasilpenjumlahan);
	}

}

