import java.util.Scanner;

public class reto2 {

    public static void main(String [] args){

    int cantidadpart ;

    Scanner captura=new Scanner(System.in);

    System.out.println("BINVENIDO AL CAMPEONATO DE NATACION");

    System.out.println("Ingrese La Cantidad De Prticipantes Que Van A Competir");
    cantidadpart= captura.nextInt();

    String [] nombres =new String [cantidadpart];
    double [] tiempos =new double [cantidadpart];  


    for (int i=0; i<cantidadpart;i++){
    

        System.out.println("Participante Numero "+ i);
        
            System.out.println("Ingrese El Nombre Del Jugador "+i);
            nombres[i]=captura.next();   

            captura.nextLine();

            System.out.println("Ingrese El Tiempo Del Jugador " +i);
            tiempos[i]= captura.nextDouble();   

        }
    

        for (int i=0; i< cantidadpart;i++){
            System.out.println("El Participante " + nombres[i] + " Obyuvo Un Tiempo De " + tiempos[i]); 
    
    
    captura.close();


}
}

} 
    

