import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, tinggi, alas, sisi1, sisi2, sisi3;

        System.out.println("Menghitung Luas Persegi");
        System.out.print("Sisi 1 = ");
        sisi1 = userInput.nextInt();
        System.out.print("Sisi 2 = ");
        sisi2 = userInput.nextInt();
        luas(sisi1, sisi2);

        System.out.println("Menghitung Keliling Persegi");
        System.out.print("Sisi = ");
        sisi1 = userInput.nextInt();
        keliling(sisi1);

        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        luaspersegi(panjang, lebar);

        System.out.println("Menghitung Keliling Persegi Panjang");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        kelilingpersegi(panjang, lebar);

        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Alas = ");
        alas = userInput.nextInt();
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        luassegitiga(alas, tinggi);

        System.out.println("Menghitung Keliling Segitiga");
        System.out.print("Sisi 1 = ");
        sisi1 = userInput.nextInt();
        System.out.print("Sisi 2 = ");
        sisi2 = userInput.nextInt();
        System.out.print("Sisi 3 = ");
        sisi3 = userInput.nextInt();
        kelilingsegitiga(sisi1, sisi2, sisi3);
    }

    public static void luas(int sisi1, int sisi2){
        int luas = sisi1 * sisi2;
        System.out.println("Luas = "+ luas);
    }

    public static void keliling(int sisi1){
        int keliling = 4 * sisi1;
        System.out.println("Keliling = "+ keliling);
    }

    public static void luaspersegi(int panjang, int lebar){
        int luaspersegi = panjang * lebar;
        System.out.println("Luas Persegi = "+ luaspersegi);
    }

    public static void kelilingpersegi(int panjang, int lebar){
        int kpersegi = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi = "+ kpersegi);
    }

    public static void luassegitiga(int alas, int tinggi){
        int luassegitiga = 1/2 * (alas * tinggi);
        System.out.println("Luas Segitiga = "+ luassegitiga);
    }

    public static void kelilingsegitiga(int sisi1, int sisi2, int sisi3){
        int ksegitiga = sisi1 * sisi2 * sisi3;
        System.out.println("Keliling Segitiga = "+ ksegitiga);
    }
}
