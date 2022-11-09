public class VirtualDemo {
    
    public static void main(String[]args){
        Gaji s = new Gaji("Wahyu", "KUBAR", 3,5000.00);
        Pegawai e = new Gaji("ini nama", "Samarinda", 2,2500.00);
        System.out.println("Memanggil mailCheck Berdasarkan referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan refrensi Pegawai --");
        e.mailCheck();
    }
}
