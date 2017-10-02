package modul5;

/**
 * Created by iampamungkas on 10/2/17.
 */
public class Manager extends Karyawan {
    private Karyawan staff[] =  new Karyawan[10];
    private int jumKaryawan = 0;
    private int golongan;

    public Manager(String nama, double gaji, int golongan) {
        super(nama, gaji);
        this.setGolongan(golongan);
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        if((golongan > 3)||(golongan < 1)) golongan = 1;
        this.golongan = golongan;
    }

    public void addStaff(Karyawan k) {
        this.staff[this.getJumKaryawan()] = k;
        this.setJumKaryawan(this.getJumKaryawan()+1);
    }

    public Karyawan getStaff(int idx){
        return this.staff[idx];
    }

    public void setKinerja(int kinerja){
        if(kinerja > 85){
            this.setGaji(this.getGaji()*1.1);
            for (int i = 0; i < getJumKaryawan(); i++) {
                this.staff[i].setGaji(1.1*this.staff[i].getGaji());
            }
        }else if (kinerja < 40 ){
            this.setGaji(this.getGaji()*0.85);
            for (int i = 0; i < getJumKaryawan(); i++) {
                this.staff[i].setGaji(0.85*this.staff[i].getGaji());
            }
        }
    }

    public double getGaji() {
        double x = 0;
        switch (this.getGolongan()){
            case 1: x = super.getGaji()+1500000;
                    break;
            case 2: x = super.getGaji()+2000000;
                    break;
            case 3: x = super.getGaji()+3000000;
                    break;
        }
        return x;
    }

    public int getJumKaryawan() {
        return jumKaryawan;
    }

    private void setJumKaryawan(int jumKaryawan) {
        this.jumKaryawan = jumKaryawan;
    }
}
