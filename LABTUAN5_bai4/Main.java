import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);

        System.out.println("Nhap thong tin hinh tron:");
        MovableCircle circle = new MovableCircle(0, 0, 0, 0, 0);
        circle.nhap();

        System.out.println("Vi tri ban dau: " + circle);

        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle);

        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle);

        circle.moveLeft();
        System.out.println("Sau khi di chuyen sang trai: " + circle);

        circle.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + circle);
    }
}
