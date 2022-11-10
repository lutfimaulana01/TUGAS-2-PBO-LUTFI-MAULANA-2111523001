public class Elemen {
    public String name;
    public int jamSibuk;

    public Elemen(String name) {
        /*
         * Consturctor superclass merupakan suatu bentuk dari DOWNCASTING,
         * diakrenakan ia adalah referensi bagi subclassnya.Yang mana
         * jikalau super class dibuatkan constructor,maka subclass juga harus dibuatkan
         * constructornya,jika tidak maka akan terjadi error
         */
        this.name = name;
    }
}

class Dosen extends Elemen {
    /* extends merupakan salah satu bentuk awalan dari pembentukan POLYMORPHISME */
    private int jumlahHariKerja;

    public Dosen(String name, int jumlahHariKerja) {
        super(name);
        jamSibuk = jumlahHariKerja * 8;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void menampilkan() {
        System.out.println(name + " merupakan seorang dosen dengan jam sibuk " + jamSibuk);
    }
}

class Mahasiswa extends Elemen {
    private int sks;

    public Mahasiswa(String name, int sks) {
        super(name);
        jamSibuk = sks * 3;
    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void menampilkan() {
        System.out.println(name + " merupakan seorang mahasiswa dengan jam sibuk " + jamSibuk);
    }
}

class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String name, int sks, int jamNgasdos) {
        super(name, sks);
        jamSibuk = jamSibuk + jamNgasdos;

    }

    public int getJamSibuk() {
        return jamSibuk;
    }

    public void menampilkan() {
        /*
         * method tunjukan() merupakan suatu bentuk UPCASTING,
         * dikarenakan mengubah referensi methodnya sendiri,dan tidak mengambil isi method
         * atau referensinya
         * dari class induknya
         */
        System.out.println(name + " merupakan seorang asdos dengan jam sibuk " + jamSibuk);
    }
}
