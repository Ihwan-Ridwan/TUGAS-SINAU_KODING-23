import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Buku;
import bukuenum.StatusBuku;

public class Main4 {
    static Scanner input = new Scanner(System.in);
    static Buku Buku;

    public static void main(String[] args) {
        boolean confirm = true;
        Scanner scan = new Scanner(System.in);
        List<Buku> daftarBuku = new ArrayList<>();

        while (confirm){

            Buku = new Buku();

            System.out.print("=====================================\n");

            System.out.print("Masukan Judul : ");
            Buku.setJudul(input.next());

            System.out.print("Masukan Penerbit : ");
            Buku.setPenerbit(input.next());

            System.out.print("Masukan Tahun : ");
            Buku.settahunTerb(input.next());

            System.out.print("Masukan Pengarang : ");
            Buku.setPengarang(input.next());

            System.out.print("ISBN : ");
            Buku.setISBN(input.next());

            System.out.print("Tanggal Kembali : ");
            Date param = BukuInterface.stringToDate(scan.nextLine());
            Buku.setTglKembali(param);

            if (param == null) {
                Buku.setStatusBuku(StatusBuku.BELUM_DIKEMBALIKAN);
            } else {
                Buku.setStatusBuku(StatusBuku.SUDAH_DIKEMBALIKAN);
            }

            daftarBuku.add(Buku);

           System.out.print("Ingin menambahkan data lagi? (y/n) ? ");
            String conf = scan.next();

            if (conf.toLowerCase().equals("n")) {
                confirm = false;
            }
        
            
        }
        
        
        System.out.println("\n======== Status Buku ========");
        for (Buku Buku : daftarBuku) {
            System.out.println("Judul\t:" + Buku.getJudul() + "\n");
            System.out.println("Penerbit\t:" + Buku.getPenerbit() + "\n"); 
            System.out.println("Tahun Terbit\t:" + Buku.gettahunTerb() + "\n");
            System.out.println("Pengarang\t:" + Buku.getPengarang() + "\n");
            System.out.println("ISBN\t:" + Buku.getISBN() + "\n");
            System.out.println("Status\t:"+ Buku.getStatusBuku() + "\n"); 
            System.out.println("Tanggal Kembali\t: "+ Buku.getTglKembali() + "\n");

        }

        
    }

}
