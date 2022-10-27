import java.io.ObjectInputFilter.Status;
import java.util.Date;

public class Buku {
    
    private String judul;
    private String penerbit;
    private String tahunTerbit;
    private String pengarang;
    private String isbn;
    Date tglKembali;
    StatusBuku status;

    public String getJudul(){
        return judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getPenerbit(){
        return penerbit;
    }

    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }

    public String gettahunTerb(){
        return tahunTerbit;
    }

    public void settahunTerb(String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getPengarang(){
        return pengarang;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public String getISBN(){
        return isbn;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public Date getTglKembali(){
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali){
        this.tglKembali = tglKembali;
    }

    public StatusBuku getStatusBuku() {
        return status;
    }

    public void setStatusBuku(StatusBuku status) {
        this.status = status;
    }
}
