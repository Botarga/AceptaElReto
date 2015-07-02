import java.util.Scanner;


/**
 * Problema sobre encontrar el camino más rápido de solucionar un tablero de
 * serpientes y escaleras
 * @author Botarga
 */
public class SerpienteYEscaleras {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        boolean terminado = false;
        short[] datos = new short[4];
        short[] casillasSerpiente;
        short[][] escalera; //Se guarda casilla inicial e incremento
        short aux;
        
        while(!terminado){
            terminado = true;
            
            //Leer primera entrada de datos
            for(byte i = 0; i < 4; i++){
                datos[i] = in.nextShort();
                if (datos[i] != 0)
                    terminado = false;
            }
            
            //Condición de salida
            if(!terminado){
                //Inicializar arrays 
                casillasSerpiente = new short[datos[2]];
                escalera = new short[datos[3]][2];
                
                //Encontrar casillas prohibidas de pisar (serpientes)
                for(byte i = 0; i < datos[2]; i++){
                    casillasSerpiente[i] = in.nextShort();
                    in.nextShort();
                }
                
                //Guardar Escaleras
                for(byte i = 0; i < datos[3]; i++){
                    escalera[i][0] = in.nextShort();
                    aux = in.nextShort();
                    escalera[i][1] = (short)(aux-escalera[i][0]);
                }
                System.out.println("Datos leidos");
            }
        }
        
        in.close();
    }
}
