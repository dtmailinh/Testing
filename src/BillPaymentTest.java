import org.junit.Test;
import static org.junit.Assert.*;

public class BillPaymentTest {
    @Test
    /*
     * Đầu vào: Giờ bắt đầu không hợp lệ, giờ kết thúc không hợp lệ => không hợp lệ
     */
    public void testPayment1() {
        double output = BillPayment.Tinhgiatien(10,24);
        double expected = -1;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
    * Đầu vào: Giờ bắt đầu không hợp lệ, giờ kết thúc hợp lệ => không hợp lệ
    */
    public void testPayment2() {
        double output = BillPayment.Tinhgiatien(10,15);
        double expected = -1;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
     * Đầu vào: Giờ bắt đầu hợp lệ, giờ kết thúc không hợp lệ => không hợp lệ
     */
    public void testPayment3() {
        double output = BillPayment.Tinhgiatien(10,24);
        double expected = -1;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
     * Đầu vào: Giờ bắt đầu hợp lệ, giờ kết thúc hợp lệ, tổng thời gian > 3 => tính tiền, được giảm giá từ giờ thứ 4 trở đi
     */
    public void testPayment4() {
        double output = BillPayment.Tinhgiatien(12,17);
        double expected = 66000.0;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
     * Đầu vào: Giờ bắt đầu hợp lệ, giờ kết thúc hợp lệ, tổng thời gian < 3 => tính tiền, không được giảm giá
     */
    public void testPayment5() {
        double output = BillPayment.Tinhgiatien(13,15);
        double expected = 30000.0;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
     * Đầu vào: Giờ bắt đầu trong khoảng 14h-17h, giờ kết thúc hợp lệ => tính tiền, được giảm giá tổng hóa đơn
     */
    public void testPayment6() {
        double output = BillPayment.Tinhgiatien(17,19);
        double expected = 27000;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }
    @Test
    /*
     * Đầu vào: Giờ bắt đầu trong khoảng 14h-17h, giờ kết thúc hợp lệ, tổng thời gian > 3 => tính tiền, được giảm giá theo giờ và tổng hóa đơn
     */
    public void testPayment7() {
        double output = BillPayment.Tinhgiatien(15,21);
        double expected = 68850;
        double delta = 0.001;
        assertEquals(expected, output, delta);
    }

}