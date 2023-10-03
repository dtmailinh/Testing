import java.util.*;  

public class BillPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Giobatdau = sc.nextInt();
        int Gioketthuc = sc.nextInt();
        double Tongtien = Tinhtien(Giobatdau, Gioketthuc);
        if (Tongtien > 0) {
            System.out.println("So tien can thanh toan la: " + Tongtien);
        } else {
            System.out.println("Thoi gian khong hop le!");
        }
    }

    public static double Tinhtien(int Giobatdau, int Gioketthuc) {
        double giatien = 15000, tong = 0;
        if ((Giobatdau > Gioketthuc) || Giobatdau < 12 || Gioketthuc > 23) {
            return -1.0;
        }
        else {
            int thoigian = Gioketthuc - Giobatdau;
            tong = thoigian * giatien;
            if (thoigian > 3) {
                tong = tong - (thoigian - 3) * 0.3 * giatien;
            }
            if (Giobatdau >= 14 && Giobatdau <= 17) {
                tong = tong * 0.9;
            }
        }
        return tong;
    }
}
