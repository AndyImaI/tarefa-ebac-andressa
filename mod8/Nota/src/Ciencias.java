public class Ciencias {

    public static void main (String args[]){
    
    int cienciasProva1 = 7;

    int cienciasProva2 = 5;

    int cienciasSoma = cienciasProva1 + cienciasProva2;

    System.out.println("Soma das notas : " + cienciasSoma);

    int notaFinal = cienciasSoma / 2;

    //System.out.println(notaFinal);

    boolean seMaior = notaFinal >= 7; 
    System.out.println("Nota Final : "  +  notaFinal);

    if (seMaior ){ 
    System.out.println("APROVADO");
    }else 
        System.out.println("REPROVADO");
    }


    }

