class LimasSegiEmpat extends SegiEmpat {
        int tinggiLimas;

    public LimasSegiEmpat(int LEBAR, int PANJANG, int TINGGILIMAS) {
        super(LEBAR, PANJANG);
        this.tinggiLimas = TINGGILIMAS;
    }
    public double luas() {
        return (panjang * lebar);
    }

    public double Volume() {
        return (luas() * tinggiLimas / 3);
    }

    public void tampil() {
        System.out.println("Volume LimasSegiEmpat = " + Volume());
    }

    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat(10, 10);
        LimasSegiEmpat  lse= new LimasSegiEmpat(55, 10, 12);
        se.tampil();
        lse.tampil();
    }
}