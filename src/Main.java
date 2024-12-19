import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Principal registro = new Principal();
        //Menú
        while (true){
            System.out.println("       MENÚ\n------------------");
            System.out.println("1. Agregar cliente \n2. Mostrar \n3. Salir \nSeleccione una opcion:  ");
            int opcion=sc.nextInt();
            sc.nextLine();

            if(opcion==1){
                for(int i=0; i<3;i++){
                    System.out.println("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su cedula: ");
                    int cedula = sc.nextInt();
                    sc.nextLine();
                    //Llama a la funcion para agregar el cliente
                    registro.agregarClientes(cedula,nombre);
                }

            } else if(opcion==2){
                registro.mostrarClientes();
            } else if(opcion==3){
                System.out.println("Saliendo...");
                break;
            }
        }
        sc.close();
    }
}