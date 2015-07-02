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
        boolean terminadoMeta = false;
        boolean haySerpiente;
        short[] datos = new short[4];
        short[] casillasSerpiente;
        short[][] escalera; //Se guarda casilla inicial e incremento
        short casillaActual;
        short movimientos;
        short mejorEscalera;
        short mejorImpulso;
        
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
                    escalera[i][1] = in.nextShort();
                }
                System.out.println("datos leidos");
                //Inicializar y comenzamos a calcular movimienos
                casillaActual = 1;
                terminadoMeta = false;
                movimientos = 0;
                
                while(!terminadoMeta){
                    if(casillaActual >= datos[0] * datos[0])
                        break;
                    //Elegir mejor escalera en rango de tiro
                    mejorImpulso = mejorEscalera = -1;
                    for(byte i = 0; i < escalera.length; i++){
                        if(escalera[i][0] <= casillaActual+datos[1] 
                                && escalera[i][1] > mejorImpulso){
                            mejorEscalera = i;
                            mejorImpulso = escalera[i][1];
                        }
                    }
                    //Si hay escalera
                    if(mejorEscalera != -1){
                        casillaActual = escalera[mejorEscalera][1];
                        movimientos++;
                    }
                    //Si no, mover a casilla más lejana sin serpiente
                    else{
                        for(int i = casillaActual + datos[1]; i > casillaActual;i--){
                            haySerpiente = false;
                            for(int j = 0; j < casillasSerpiente.length; j++){
                                if(casillasSerpiente[j] == i){
                                    haySerpiente = true;
                                    break;
                                }
                            }
                            if(!haySerpiente){
                                casillaActual = (short) i;
                                movimientos++;
                                break;
                            }
                        }
                    }
                }
                System.out.println("Salida");
                System.out.println(movimientos);
                
            }
        }
        
        in.close();
    }
}
