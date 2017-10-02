package modul5;

/**
 * Created by iampamungkas on 10/2/17.
 */
public class Karyawan {
    private String nama;
    private double gaji;

    public Karyawan (String nama, double gaji) {
        this.setNama(nama);
        this.setGaji(gaji);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}
