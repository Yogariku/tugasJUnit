package com.sqa.testjunit;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Masukkan jarak tempuh (dalam km): ");
		double jarak = in.nextInt();
		System.out.println("Masukkan waktu tempuh (dalam jam): ");
		double waktu = in.nextInt();
		double kmh = hasil(jarak,waktu);
		
		System.out.println("Jadi, kecepatan rata-ratanya adalah " +kmh+ " km/jam");
	}
	
	public static double hasil(double jarak, double waktu) {
		double kmh = jarak/waktu;
		return kmh;
	}

}
