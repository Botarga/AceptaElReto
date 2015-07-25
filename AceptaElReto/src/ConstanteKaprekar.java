import java.io.*;
import static java.lang.System.*;
import java.util.Arrays;

public class ConstanteKaprekar 
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        int casos;
        int maximo, minimo, iteraciones;
        boolean repDigit;
        String cadena;
        char auxSwap;
        
        casos = Integer.parseInt(in.readLine());
        
        for(int i = 0; i < casos; i++)
        {
            out.println("Iteracion: " + (i+1));
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
                    
                    //Generar mínimo
                    char[] c = cadena.toCharArray();
                                       
                    for(int j = 0; j < 3; j++)
                    {
                        for(int k = j+1; k < 4; k++)
                        {
                            if(Character.compare(c[j], c[k]) > 0)
                            {
                                auxSwap = c[j];
                                c[j] = c[k];
                                c[k] = auxSwap;
                            }
                        }
                    }
                    
                    out.println("El array esta asi " + c.toString());
                    minimo = Integer.parseInt(new String(c.toString()));
                    
                    //Generar máximo
                    for(int j = 0; j < 3; j++)
                    {
                        for(int k = j+1; k < 4; k++)
                        {
                            if(Character.compare(c[j], c[k]) < 0)
                            {
                                auxSwap = c[j];
                                c[j] = c[k];
                                c[k] = auxSwap;
                            }
                        }
                    }
                    maximo = Integer.parseInt(c.toString());
                    
                    
                    out.println("El minimo es " + minimo);
                    out.println("El maximo es " + maximo);
                }
                
            }
        }
    }
}
