public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int i = Integer.parseInt(args[0]);
        //System.out.println(i);
        boolean[] primes = new boolean[i + 1];
        double doubI = (double) i;
        double sqrtI = Math.sqrt(doubI);
        //System.out.println("Double i " + sqrtI);
        int sqrtIInt = (int) sqrtI;
        //System.out.println("int i " + sqrtIInt);
        int p=2;
        int j = 0;
        // initialize
        while (j < primes.length) {
            primes[j] = true;
            j++;
        }
        j = p+1;
        primes[0] = false;
        primes[1] = false;
        while(p<=sqrtIInt){
            while(j<primes.length){
                if(j%p==0){
                    primes[j]=false;
                    //System.out.println(j);
                }
                j++;
            }
            p++;
            j=p+1;
        }
        //primes[2] = true;
        //primes[3] = true;
        int primeCnt=0;
        System.out.printf("Prime numbers up to %d:%n",i);
        for(int k=0;k<primes.length;k++){
            if(primes[k]==true){
                System.out.println(k);
                primeCnt++;
            }
        }
        double percentage=((double)primeCnt/(double)i)*100;
        //System.out.println(percentage);
        int percentageInt=(int) percentage;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)", primeCnt, i, percentageInt);
    }
}