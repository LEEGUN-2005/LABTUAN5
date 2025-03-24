import java.util.Scanner;

public class HinhChuNhat implements Hinh {
    private float dai, rong;

    @Override
    public void nhap() {
        Scanner kb= new Scanner(System.in);
        System.out.print("Nhap chieu dai hcn: ");
        dai = kb.nextFloat();
        System.out.print("Nhap chieu rong hcn: ");
        rong =kb.nextFloat();
    }
    @Override
    public void xuat() {
        System.out.println("HCN- DAI: " + dai + ",RONG: " + rong + " | Dien tich: " + dienTich());
    }
    @Override
    public float dienTich() {
        return dai * rong;
    }
}

