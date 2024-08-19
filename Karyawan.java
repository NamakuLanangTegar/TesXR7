public class Karyawan {

    int id;
    String nama;
    String unit;
    String domisili;

    public Karyawan (int id, String nama, String unit, String domisili) {
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.domisili = domisili;
    }
    public void print () {
        System.out.println("Nama : " + nama);
        System.out.println("ID : " + id);
        System.out.println("Unit : " + unit);
        System.out.println("Domisili : " + domisili);
        System.out.println("    ");
    }
}
