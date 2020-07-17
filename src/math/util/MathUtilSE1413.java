package math.util;
import hoa.util.MathUtil;
import static hoa.util.MathUtil.computeFactorial;
/**
 *
 * @author HoaDD
 */
public class MathUtilSE1413 {
    public static void main(String[] args) {
        //hy vong ham tra ve 120 neu tinh 5!
        System.out.println("5 != " + MathUtil.computeFactorial(5));
        
        //hy vong ham tra ve 1 neu tinh 1!
        //expected 1 if cF(1)
        System.out.println("1! = " + computeFactorial(1));
        
        System.out.println("0! = " + computeFactorial(0));
        
        //expected Exception if cF(-5)
        System.out.println("-5! = " + computeFactorial(-5));
    }
}
