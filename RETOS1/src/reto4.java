public class reto4{
    public static void main(String[] args) {
        
        String [][] maquina = {
      {"cocacola","chocolatina","sprite","chetos","todo riko","BomBonBum"},
      {"1000","2500","3500","5000","2000","2800"},
    };
          for (int i = 0; i < maquina.length; i++) {
            for (int j = 0; j < maquina[i].length; j++) {
                System.out.print(maquina[i][j] + " ");
            }
            System.out.println(); // Agregar un salto de línea después de cada fila
        }
    }
}
