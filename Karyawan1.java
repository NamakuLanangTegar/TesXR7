public class Karyawan1 {
    public static void main(String[] args) {
        Karyawan shinta = new Karyawan(1, "Shinta", "Head Chef", "Kediri");
        Karyawan tegar = new Karyawan(2, "Tegar", "CEO", "Tokyo");
        Karyawan bruce = new Karyawan(3, "Bruce", "Manager", "Gotham" );
        Karyawan towa = new Karyawan(4, "Towa", "Butler", "Surabaya");
        Karyawan robin = new Karyawan(5, "Robin", "Assistant Manager", "Paris");

        shinta.print();
        tegar.print();
        bruce.print();
        towa.print();
        robin.print();
    }
}
