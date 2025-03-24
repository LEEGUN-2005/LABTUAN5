public class PhucVu extends NhanVien {
public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo, double luongCoBan) {
        super(maNhanVien, tenNhanVien, trinhDo, luongCoBan);
    }
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
    public PhucVu() {}
}
