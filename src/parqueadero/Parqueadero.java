package parqueadero;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import vehiculo.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Parqueadero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int id;
        int contador=0;
        int buscar;
        String buscar2;
        Vehiculo[] vehiculo= new Vehiculo[10];
        System.out.println("Bienvenido");
        do{
            System.out.println("");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("");
            System.out.println("1. Registrar un vehiculo");
            System.out.println("2. Salida de vehiculo");
            System.out.println("3. Consultar todos los vehiculos");
            System.out.println("4. Consultar información de un conductor");
            System.out.println("5. Consultar un vehiculo");
            System.out.println("6. Salir \n");
            System.out.println("Digite una opción");
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    if (contador<20){
                        vehiculo[contador]=new Vehiculo();
                        DateTimeFormatter fechaEntrada = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        vehiculo[contador].setFechaEntrada(fechaEntrada.format(LocalDateTime.now()));
                        System.out.println("");
                        System.out.println("Ingrese la placa");
                        vehiculo[contador].setPlaca(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese la cédula del propietario");
                        vehiculo[contador].setCedula(entrada.nextInt());
                        System.out.println("");
                        System.out.println("Ingrese el nombre del propietario");
                        vehiculo[contador].setNombre(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese el apellido del propietario");
                        vehiculo[contador].setApellido(entrada.next());
                        System.out.println("");
                        System.out.println("Ingrese el telefono fijo del propietario");
                        vehiculo[contador].setFijo(entrada.nextInt());
                        System.out.println("");
                        System.out.println("Ingrese el telefono movil del propietario");
                        vehiculo[contador].setMovil(entrada.nextInt());
                        System.out.println("");
                        contador++;
                    }else{
                        System.out.println("El parqueadero está lleno");
                    }
                    break;
                case 2:
                    break;    
                case 3:
                    System.out.println("");
                    int h=1;
                    if (contador>0){
                        for (int i=0; i<contador; i++){
                            System.out.println("Vehiculo " +h+ ":");
                            System.out.println(""); 
                            System.out.println("La placa es " +vehiculo[i].getPlaca());
                            System.out.println("Y su fecha de entrada fue el " +vehiculo[i].getFechaEntrada());
                            System.out.println("La cédula del propietario es " +vehiculo[i].getCedula());
                            System.out.println("Su nombre es " +vehiculo[i].getNombre());
                            System.out.println("Su apellido es " +vehiculo[i].getApellido());
                            System.out.println("Su teléfono fijo es " +vehiculo[i].getFijo());
                            System.out.println("Su teléfono móvil es " +vehiculo[i].getMovil());
                            System.out.println(""); 
                            h++;
                        }
                    }else{
                        System.out.println("Aún no se ha registrado ningún vehiculo");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=6 || contador<20);
    }
}
