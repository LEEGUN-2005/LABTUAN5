import java.util.Scanner;
public class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapCongViec;

    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan,
                  String chuyenMon, double phuCapCongViec) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
        this.chuyenMon = chuyenMon;
        this.phuCapCongViec = phuCapCongViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner kb = new Scanner(System.in);
        System.out.print("nhap chuyen mon: ");
        chuyenMon = kb.nextLine();
        System.out.print("nhap phu cap cong viec: ");
        phuCapCongViec =kb.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(" | Chuyen mon: " + chuyenMon + " | Phu cap: " + phuCapCongViec);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapCongViec;
    }
    public QuanLy() {}
}

