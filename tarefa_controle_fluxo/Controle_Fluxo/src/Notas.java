import java.util.Scanner;

public class Notas {


        public int mat1;

        public int mat2;

        public int mat3;

        public int mat4;

        public int matTotal;

    public static void main (String args []){

       Scanner scan = new Scanner(System.in);
            System.out.println("Qual sua primeira nota de matematica?");
            int mat1 = scan.nextInt();
          
            System.out.println("Qual sua segunda nota de matematica?");
            int mat2 = scan.nextInt();

            System.out.println("Qual sua terceira nota de matematica?");
            int mat3 = scan.nextInt();

            System.out.println("Qual sua quarta nota de matematica?");
            int mat4 = scan.nextInt();


           int matTotal = mat1 + mat2 + mat3 + mat4;

           int notaFinal = matTotal / 4;

          
          if (notaFinal >= 7 && notaFinal >= 10){
              System.out.println("APROVADA");
             } else if (notaFinal <=5 && notaFinal <=6){
               System.out.println("EM RECUPERAÇÃO");
            } else {
             System.out.println("REPROVADO");
        }
           
    }

        
}



