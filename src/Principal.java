import java.security.spec.RSAOtherPrimeInfo;

public class Principal {
    int[] cedula = new int[3];
    String[] nombre = new String[3];

    int totalIngresos = 0;

    public void agregarClientes(int cedula, String nombre){
        if (totalIngresos<3){
            this.cedula[totalIngresos]=cedula;
            this.nombre[totalIngresos]=nombre;
            totalIngresos++;
            System.out.println("Cliente agregado");
        }else {
            System.out.println("No se puede agregar mas información");
        }
    }

    public void mostrarClientes(){
        if(totalIngresos==0){
            System.out.println("No hay más clientes ");

        }else{
            for(int i=0; i<totalIngresos; i++){
                System.out.println("Cedula: "+cedula[i]+"\nNombre: "+nombre[i]);
            }
        }
    }
}
