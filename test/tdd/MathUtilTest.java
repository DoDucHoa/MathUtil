package tdd;

/**
 *
 * @author HoaDD
 */
import static hoa.util.MathUtil.computeFactorial;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;



public class MathUtilTest {
    
    @Test
    public MathUtilTest() {
         //bao cho JVM biet rang day la main()
        //trong ham nay chua cac lenh de test code chinh cua minh o ben trong MathUtil
        //ta test tinh huong thanh cong o day
        //thannh cong: cF(5) -> ói về 120 goi la thanh cong
        public void testSucessfulCases(){
            assertEquals(30, 50);
            //kì vọng có 30, xem m đưa vào thuc te là bao nhiru
            //                                  50
            //2 thứ khớp nhau, m xử lí nhu du kien, den xanh thong thuong
            //                      ko nhu du kien, den do, toang code m

            assertEquals(120, computeFactorial(5));
            assertEquals(720, computeFactorial(6));
            assertEquals(1, computeFactorial(0));
            assertEquals(1, computeFactorial(1));
            assertEquals(2, computeFactorial(2));

        }
    }

    
    @Test(expected = IllegalArgumentException.class) //annotation, dấu hiệu báo cho JVM và thư viện jar liên quan biết phải làm gì
    //     hàm này chứa tình huống cà chớn, ví dụ cF(-5), cF(16)
    
    public void testFailedCases(){
        //tao kì vọng mày ném ra ngoại lệ thì coi như code của m mới ngon, vì -5
        //éo tính ! được, phải báo
        //nen minh ko co xai ham assertEquals() dc vì hàm này cần 2 value expected và actual
        //trong khi đó ném ra ngoại lệ ko phảo là actual value để so sánh
        //ta phải xài chiêu thức khác khi bắt ngoại lệ coi có đúng là ngoại lệ mình cần ko
        computeFactorial(-5);
    }
    //code có thể tiềm ẩn lỗi nhưng clean & build luôn ra file .jar nếu code ko sai cú pháp
//vay thì nguy hiem qua di
//mình phải DISABLE cái nút clean & build nếu code còn màu đỏ
//nhớ 2 con số: 1005 Netbeans 8, 1204 Netbeans 10 trở lên
//khi chơi với Ant project
}
