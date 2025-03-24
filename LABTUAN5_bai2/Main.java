import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        ArrayList<Hinh> danhSachHinh = new ArrayList<>();

        System.out.print("Nhap so luong hinh: ");
        int soLuong =kb.nextInt();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("\nchon loai hinh (1. Hinh Vuong, 2. HCN, 3. Hinh Tron): ");
            int loaiHinh =kb.nextInt();
            
            Hinh hinh;
            switch (loaiHinh) {
                case 1:
                    hinh = new HinhVuong();
                    break;
                case 2:
                    hinh = new HinhChuNhat();
                    break;
                case 3:
                    hinh = new HinhTron();
                    break;
                default:
                    System.out.println("vui long chon lai");
                    continue;
            }
            
            hinh.nhap();
            danhSachHinh.add(hinh);
        }

        System.out.println("\ndanh sach cac hinh:");
        for (Hinh h : danhSachHinh) {
            h.xuat();
        }
    }
}

