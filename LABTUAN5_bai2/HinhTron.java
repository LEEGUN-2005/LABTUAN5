import java.util.Scanner;

public class HinhTron implements Hinh {
    private float banKinh;

    @Override
    public void nhap() {
        Scanner kb= new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        banKinh = kb.nextFloat();
    }
    @Override
    public void xuat() {
        System.out.println("HINH TRON- ban kinh: " + banKinh + " |Dien tich: " + dienTich());
    }
    @Override
    public float dienTich() {
        return pi * banKinh * banKinh;
    }
}
