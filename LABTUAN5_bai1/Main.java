import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        Scanner kb= new Scanner(System.in);

        while (true) {
            System.out.println("\n****QUAN LY NHAN VIEN****");
            System.out.println("1.THEM NHAN VIEN QUAN LY");
            System.out.println("2.THEM NHAN VIEN NGHIEN CUU");
            System.out.println("3.THEM NHAN VIEN PHUC VU");
            System.out.println("4.HIEN THI DANH SACH NHAN VIEN");
            System.out.println("5.THOAT");
            System.out.print("CHON CHUC NANG: ");
            int chon = kb.nextInt();
            kb.nextLine();

            switch (chon) {
                case 1:
                    QuanLy ql = new QuanLy();
                    ql.nhap();
                    danhSachNhanVien.add(ql);
                    break;
                case 2:
                    NghienCuu nc = new NghienCuu();
                    nc.nhap();
                    danhSachNhanVien.add(nc);
                    break;
                case 3:
                    PhucVu pv = new PhucVu();
                    pv.nhap();
                    danhSachNhanVien.add(pv);
                    break;
                case 4:
                    for (NhanVien nv : danhSachNhanVien) {
                        nv.xuat();
                        System.out.println(" | Luong: " + nv.tinhLuong());
                    }
                    break;
                case 5:
                    System.out.println("THOAT CHUONG TRINH.");
                    return;
                default:
                    System.out.println("vui long chon lai.");
            }
        }
    }
}

