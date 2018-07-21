package com.MasterZul;

public class Main {

    public static void main(String[] args) {
	printMegaBytesAndKiloBytes(2056);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = 0, lastKiloBytes = 0;
        megaBytes = (int) (kiloBytes / 1024.0);
        lastKiloBytes = (int) (kiloBytes % 1024.0);

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + lastKiloBytes + " KB");
        }
    }
}
