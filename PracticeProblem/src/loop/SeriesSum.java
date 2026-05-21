package loop;

public class SeriesSum {

    public static void main(String[] args) {

        int evenSumFor = 0, oddSumFor = 0;
        int evenSumWhile = 0, oddSumWhile = 0;
        int evenSumDoWhile = 0, oddSumDoWhile = 0;

        System.out.println("\nFOR LOOP:");

        for (int i = 2; i <= 20; i += 2) 
        {
   
            evenSumFor += i;
        }

        System.out.println("Even Sum : " + evenSumFor);

        for (int i = 1; i <= 19; i += 2)
     {
         
            oddSumFor += i;
        }

        System.out.println("Odd Sum : " + oddSumFor);

        System.out.println("\n\nWHILE LOOP:");

        int i = 2;
        while (i <= 20) 
        {
        
            evenSumWhile += i;
            i += 2;
        }

        System.out.println("Even Sum : " + evenSumWhile);

        i = 1;
        while (i <= 19) 
        {
         
            oddSumWhile += i;
            i += 2;
        }

        System.out.println("Odd Sum : " + oddSumWhile);

        System.out.println("\n\nDO-WHILE LOOP:");

        int j = 2;
        do 
        {
           
            evenSumDoWhile += j;
            j += 2;
        } 
        while (j <= 20);

        System.out.println("Even Sum : " + evenSumDoWhile);

        j = 1;
        do
         {
            
            oddSumDoWhile += j;
            j += 2;
        } 
        while (j <= 19);

        System.out.println("Odd Sum : " + oddSumDoWhile);
    }
}