import java.util.Scanner;

//Concentrese (Matrices)
public class reto3 {
public static void main(String[] args) {



  int numero=4;

  Scanner lectura=new Scanner(System.in);
  
  System.out.println("CONCENTRESE ");
  System.out.println("Vamos a descubrir 16 palabra ¡¿preparado? ");

  
  String [][] pEncontrar = new String [4][4];

  for(int i=0; i<numero; i++){
    for(int k=0; k<numero; k++){
        System.out.println("digita en poscición "+i+"/"+k);
        pEncontrar[i][k]= lectura.next();

    }

   
  }
  for(int i=0; i<numero; i++){
    for(int k=0; k<numero; k++){
        System.out.print("/r"+pEncontrar[i][k]);

    }
    System.out.println("");


    lectura.close();

}
  }
}