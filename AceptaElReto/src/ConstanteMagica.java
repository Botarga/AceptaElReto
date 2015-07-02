import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Miguel
 */
public class ConstanteMagica {
    public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        short n, k;
        String[] en = new String[2];
        while(true){
            en = in.readLine().split(" ");
            n = Short.parseShort(en[0]);
            k = Short.parseShort(en[1]);
            
            if (n != 0 || k != 0){
                System.out.println((((short)(Math.pow(n, 3))+n) / 2) + (--k*n));
            }
            else
                break;
        }
        
    }
}
