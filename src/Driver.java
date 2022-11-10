public class Driver {
    public static void main(String[] args) {
        Asdos fair = new Asdos("fair pedro",23,4);
        Dosen raja = new Dosen("raja stephen",5);
        Asdos angel = new Asdos("angel sutejo",19,7);
        Mahasiswa firman = new Mahasiswa("firman kurnia",20);
        Mahasiswa nid = new Mahasiswa("Nid to pass this sem", 23);
        Dosen nivo = new Dosen("ahmad nivo",3);

        fair.menampilkan();
        raja.menampilkan();
        angel.menampilkan();
        firman.menampilkan();
        nid.menampilkan();
        nivo.menampilkan();

        int totJamSibuk = fair.jamSibuk + raja.jamSibuk + 
        angel.jamSibuk + firman.jamSibuk + nid.jamSibuk + nivo.jamSibuk;

        System.out.println("Total jam sibuk elemen fasilkom adalah "+totJamSibuk);
    }
}
