
//exercicio2

import java.util.Random;


public class MaxVal1 {

    public static void main(String[] args) throws Exception {

        int[] ars = geraVetor(20, 12);
        int n = 32;
        int max = maxVal1(ars, n);
        System.out.println(max);
        System.out.println("acabo");

        int[] ars2 = geraVetor(2000, 50);
        int n2 = 2050;
        int max2 = maxVal1(ars2, n2);
        System.out.println(max2);
        System.out.println("acabo2");

        int[] ars3 = geraVetor(1048570,6);
        int n3 = 1048576;
        int max3 = maxVal1(ars3, n3);
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

    public static int maxVal1(int A[], int n) {
        int max = A[0]; //1
        for (int i = 1; i < n; i++) {   //3n
            if (A[i] > max) //2
            {
                max = A[i];    //1

            }
        }
        return max;   //1 

        //3N + 5 de complexidade
    }
}
