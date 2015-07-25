import java.io.*;
import static java.lang.System.*;

public class ConstanteKaprekar 
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        int casos;
        int numero, iteraciones;
        boolean repDigit;
        String cadena;
        
        casos = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < casos; i++)
        {
            repDigit = false;
            iteraciones = 0; 
            cadena = in.readLine();
            if(cadena.length() ==4){
                //Comprobar si es la constante
                if(cadena.compareTo("6174") == 0){
                    out.println("0");
                    continue;
                }
                
                //Ver si es repdigit
                for(int j = 0; j < 3 && !repDigit; j++)
                {
                    for(int k = j+1; k < 4; k++){
                        if(Character.compare(cadena.charAt(j), cadena.charAt(k)) 
                                == 0){
                            repDigit = true;
                            break;
                        }
                    }
                }
                
                if(repDigit)
                    out.println("8");
                else
                {
                    
                }
                
            }
        }
    }
}
