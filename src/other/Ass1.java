package other;

public class Ass1
{


    /**
     * Method preyPredLV  returns an array that represents the population of preys and preds.
     *
     * @param preyPred the array with initial values of population of preys (preyPred[0]
     *                 and preds ([preyPred[1]).
     * @param a the double array contains constants a1 (a[0]) and a2 (a[1]).
     * @param b the double array contains constants b1 (b[0]) and b2 (b[1]).
     * @param n represents number of periods.
     * @return array preyPred which contains doubles - preyPred[0] (preys) and preyPred[1] (preds)
    */
    /*static  double[] preyPredLV(double [] preyPred, double[] a,
                                double[] b, int n){

        //bufSnow and bufLynx store the values of populations of preys and preds.
        double bufSnow = 0.0, bufLynx = 0.0;
        //If n is equal to zero then return original values.
        if(n == 0)
            return preyPred;

        // For loop runs n times. In every iteration the previous values of populations are stored in
        //bufSnow and bufLynx double variables.

        for(int i = 0; i < n; i++){
            //store previous values in bufors
            bufSnow = preyPred[0];
            bufLynx = preyPred[1];
            //calculate next values
            preyPred[0] = bufSnow*(1 + a[0] - a[1]*bufLynx);
            preyPred[1] = bufLynx*(1 - b[0] + b[1]*bufSnow);

        }

        return preyPred;
    }*/
    static double[] preyPredLV(double[] preyPred, double[] a, double[] b, int n){

        for(int i=1; i<n+1;i++){
            preyPred[0]=preyPred[0]*(1+a[0]-a[1]*preyPred[1]);
            preyPred[1]=preyPred[1]*(1-b[0]+b[1]*preyPred[0]);
        }

        return preyPred;
    }
    /***************** Until Here ****************************/

    public static void main(String[] args){

        double preyPred[] = new double[2];
        double a[] = new double[2];
        double b[] = new double[2];
        int n;

        a[0] = 0.1;
        a[1] = 0.01;
        b[0] = 0.01;
        b[1] = 0.00002;

        n = 1;
        preyPred[0] = 300;
        preyPred[1] = 20;

        preyPred = preyPredLV(preyPred, a, b, n);
        System.out.println("After "+n+" generations: "
                +"Snowhares: "+preyPred[0]
                +" Lynx: "+preyPred[1]);

        n = 2;
        preyPred[0] = 300;
        preyPred[1] = 20;

        preyPred = preyPredLV(preyPred, a, b, n);
        System.out.println("After "+n+" generations: "
                +"Snowhares: "+preyPred[0]
                +" Lynx: "+preyPred[1]);

        n = 300;
        preyPred[0] = 300;
        preyPred[1] = 20;

        preyPred = preyPredLV(preyPred, a, b, n);
        System.out.println("After "+n+" generations: "
                +"Snowhares: "+preyPred[0]
                +" Lynx: "+preyPred[1]);

    }
}
