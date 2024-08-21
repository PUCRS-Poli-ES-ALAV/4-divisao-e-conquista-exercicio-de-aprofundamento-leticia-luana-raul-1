//exercicio3

import static java.lang.Integer.max;
import java.util.Random;

public class MaxVal2 {

    public static void main(String[] args) throws Exception {

        int[] ars = geraVetor(20, 12);
        int n = 32;
        int max = maxVal2(ars,0,31);
        System.out.println(max);
        System.out.println("acabo");

        int[] ars2 = geraVetor(2000, 50);
        int n2 = 2050;
        int max2 = maxVal2(ars2,0,2049);
        System.out.println(max2);
        System.out.println("acabo2");

        int[] ars3 = geraVetor(1048570,6);
        int n3 = 1048576;
        int max3 = maxVal2(ars3,0,1048575);
        System.out.println(max3);
        System.out.println("acabo3");


    }

    private static int[] geraVetor(int nroPares, int nroImpares){
        int [] res = null;
        int contPar = 0, contImpar = 0, novoNum;
        Random rnd = new Random();

        if ((nroPares >= 0) ||
                (nroImpares >= 0) &&
                (nroPares + nroImpares > 0)) {

            res = new int[nroPares + nroImpares];

            while ((contPar < nroPares) || (contImpar < nroImpares)) {
                novoNum = rnd.nextInt(98)+1;

                if ((novoNum % 2 == 0) && (contPar < nroPares)) {
                    res[contPar+contImpar] = novoNum;
                    contPar++;
                }
                else if ((novoNum % 2 == 1) && (contImpar < nroImpares)) {
                    res[contPar+contImpar] = novoNum;
                    contImpar++;
                }
            }
        }
        return res;
    }

    public static int maxVal2(int A[], int init, int end) {  
        if (end - init <= 1) //2
            return max(A[init], A[end]);  //1
        else {
              int m = (init + end)/2; //3
              int v1 = maxVal2(A,init,m);  //1 
              int v2 = maxVal2(A,m+1,end); //1
              return max(v1,v2); //1
            }
        // 9 
    }
}

