    public class MAX_MIN{
    public static void main(String[] args){
        
        String DNA="ggcccgtgcaatgaatgccgtttaaaatgcccgta";
        int n, total;
        int a=0;t=0;g=0;c=0;
        float a1,t1,g1.c1;
        
        n=DNA.length();
        System.out,println("the length of the DNA is: "+ n);
        for(i=0;i<n;i++)
        {
            if(DNA.charAt(i)=='a')
            a++;
            else if(DNA.charAt(i)=='a')
            t++;
            else if(DNA.charAt(i)=='a')
            g++;
            else
            c++;
         }
         total=(a+t+g+c);
         a1=((float)a/total)*100;
         t1=((float)t/total)*100;
         g1=((float)g/total)*100;
         c1=((float)c/total)*100;
          System.out,println("the frequency of adenine is: "+ a1);
          System.out,println("the frequency of thymine is: "+ t1);
          System.out,println("the frequency of guanine is: "+ g1);
          System.out,println("the frequency of cytosine is: "+ c1);
          
          float max_freq=Math.max(Math.max(a1,t1),Math.max(g1,c1));
          float min_freq=Math.min(Math.min(a1,t1),Math.min(g1,c1));
          System.out,println("the max frequency of bases is: "+ max_freq);
           System.out,println("the min frequency of bases is: "+ min_freq);
           }
}
