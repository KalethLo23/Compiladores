
package code;

import java.io.File;
import java.util.Scanner;

public class CreateDir {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String ruta = "";
        String nombre = "";
        
        System.out.println("Ingrese nombre de su directorio ----> ");
        nombre = "\\"+teclado.nextLine();
        
        System.out.println("Ingrese la ruta en donde desea crear su directorio ----> ");
        ruta = teclado.nextLine();
        
        File directorio =new File(ruta+nombre);
        
        if (!directorio.exists()) {
            if (directorio.mkdirs()){
                System.out.print("Directorio creado");
            } else {
                System.out.println("Error al crear el directorio");
            }
        }  
    }
}
