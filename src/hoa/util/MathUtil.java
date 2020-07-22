package hoa.util;

/**
 *
 * @author HoaDD
 */
//class cua cac ham tooan hoc, tinh toan, vs muc tieu xai chung cho cac noi khac
//cai gi mang tinh chat xai chung, ta se dung static
public class MathUtil {
    //tinh n! = 1.2.3...n vi n! tang gia tri rat nhanh, som tran mien int
    //int chi toi da 2 ty 1, nen ta xai long moi an toan
    // thuc ra 15! to lam roi, nen ta chi tinh giai thua tu 15 tro lai
    public static long computeFactorial(int n){
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid input. n must be >= 0");
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
        if(n == 0 || n == 1)
            return 1;
        //điều kiện dừng của đệ quy
        //sống sót đến lệnh chỗ này thì n chắc chắn rơi vào 2...15
        //ko cần else
        return n * computeFactorial(n - 1); //n * (n - 1)!
    }
}
