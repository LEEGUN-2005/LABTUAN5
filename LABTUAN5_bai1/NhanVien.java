import java.util.Scanner;
public abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;
    public abstract double tinhLuong();

 
    public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = luongCoBan;
    }

    public void nhap() {
        Scanner kb= new Scanner(System.in);
        System.out.print("nhap ma nhan vien: ");
        maNhanVien = kb.nextLine();
        System.out.print("nhap ten nhan vien: ");
        tenNhanVien = kb.nextLine();
        System.out.print("nhap trinh do: ");
        trinhDo =kb.nextLine();
        System.out.print("nhap luong co ban: ");
        luongCoBan =kb.nextDouble();
    }

    public void xuat() {
        System.out.println("Ma NV: " + maNhanVien + " | Ten NV: " + tenNhanVien + " | Trinh do: " + trinhDo + " | Luong co ban: " + luongCoBan);
    }
    public NhanVien() {}
}
