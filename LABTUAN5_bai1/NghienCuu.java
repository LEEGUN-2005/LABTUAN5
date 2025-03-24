import java.util.Scanner;
public class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;

    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan,
                     String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner kb= new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        chuyenMon = kb.nextLine();
        System.out.print("Nhap phu cap doc hai: ");
        phuCapDocHai =  kb.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" | Chuyen mon: " + chuyenMon + " | Phu cap doc hai: " + phuCapDocHai);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
    public NghienCuu() {}
}
