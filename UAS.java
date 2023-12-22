
class Kasir {
    String namabarang;
    int jumlahbarang;
    int hargabarang;
    int bayar;
    int kembalian;

    Kasir (String namabarang, int jumlahbarang, int hargabarang, int bayar, int kembalian){
        this.namabarang =namabarang;
        this.jumlahbarang = jumlahbarang;
        this.hargabarang = hargabarang;
        this.bayar = bayar;
        this.kembalian = kembalian;
    }
    void Display(){
        System.out.println("Nama Barang : "+ namabarang);
        System.out.println("Jumlah Barang : "+ jumlahbarang);
        System.out.println("Harga Barang : "+ hargabarang);
        System.out.println("bayar : "+ bayar);
        System.out.println("kembalian : "+ kembalian);
    }
}


