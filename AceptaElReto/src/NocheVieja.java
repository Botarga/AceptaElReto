import java.io.*;

public class NocheVieja {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] a = new String[2];
        
        while(true){
            a = in.readLine().split(":");
            if(a[0].compareTo("00") == 0 && a[1].compareTo("00") == 0)
                break;
            System.out.println((23 - Integer.parseInt(a[0])) * 60 + (60-Integer.parseInt(a[1])));
        }
    }
}
