import java.util.Scanner;
public class SUPERMERCADO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombreProducto = "";
        int cantidadProducto = 0;
        boolean guardar = false;

        System.out.println("*****************");
        System.out.println("BIENVENIDO");
        System.out.println("*****************");


        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el nombre del producto: ");
            nombreProducto = sc.next();
            System.out.print("Ingrese la cantidad: ");
            cantidadProducto = sc.nextInt();
            guardar = true;
            
            System.out.println("Menú....");
            System.out.println("1.Buscar Producto  " +
                    "2. Ver productos con mayor cantidad disponible  "  +
                    "3. Ver productos con menos de 10 unidades  " +
                    "4. Salir.");
            System.out.println("Elige una opción: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Ingrese el nombre del producto que busca: ");
                     String nombreProducto2 = sc.next();
                     if (nombreProducto2.equals(nombreProducto)){
                         System.out.println("La cantidad de este producto es de : " + cantidadProducto +
                                 " unidades");
                     }else{
                         System.out.println("Producto no encontrado");
                     }
                    break;
                case 2:
                    if (cantidadProducto >=10){
                        System.out.println("El producto con mayor cantidad es: "+ nombreProducto +
                         " con la cantidad de: " + cantidadProducto + " unidades");
                    }else{
                        System.out.println("no hay producto...");
                    }
                    break;
                case 3:
                    if (cantidadProducto <10){
                        System.out.println("El producto con menor cantidad es: "+ nombreProducto +
                                " con la cantidad de: " + cantidadProducto + " unidades");
                    }else{
                        System.out.println("no hay producto...");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }sc.close();
    }
}
