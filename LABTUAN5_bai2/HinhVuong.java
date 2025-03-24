import java.util.Scanner;

public class HinhVuong implements Hinh {
    private float canh;

    @Override
    public void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhập cạnh hình vuông: ");
        canh = kb.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("hinh vuong canh: " + canh + " | Dien tich: " + dienTich());
    }
    @Override
    public float dienTich() {
        return canh * canh;
    }
}
