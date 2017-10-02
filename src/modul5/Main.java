package modul5;

/**
 * Created by iampamungkas on 10/2/17.
 */
public class Main {
    public static void main(String[] args) {
        Manager b = new Manager("Bobby", 7500000, 2);
        Karyawan k1 = new Karyawan("Alex", 5000000);
        b.addStaff(k1);
        Karyawan k2 = new Karyawan("Ruby", 4500000);
        b.addStaff(k2);
        Karyawan k3 = new Karyawan("Suzy", 5250000);
        b.addStaff(k3);
        Karyawan k4 = new Karyawan("Ben", 4750000);
        b.addStaff(k4);
        Karyawan k5 = new Karyawan("Max", 5500000);
        b.addStaff(k5);
        b.setKinerja(87);
        System.out.println(String.format("Name Manager\t: %s", b.getNama()));
        System.out.println(String.format("Gaji Manager\t: %f",b.getGaji()));
        System.out.println("Staff :");
        for (int i = 0; i < b.getJumKaryawan(); i++) {
            Karyawan k = b.getStaff(i);
            System.out.println(String.format("\t%d. Nama: %s", i+1,k.getNama()));
            System.out.println(String.format("\t   Gaji: %f", k.getGaji()));
        }
    }
}
