//COUNT GC PERCENTAGE IN A GIVEN DNA SEQUENCE
public class GC_PERCENT{
    public static void main(String[] args){
        String DNA="atttgcccaaagcccttgcgtttaattggccagggcccgt";
        
        int n=DNA.length();
        int a=0, t=0, g=0, c=0;
        float gcp;
        
        for(int i=0;i<n;i++)
        {
            switch(DNA.charAt(i))
            {
                case'a':case 'A':a++;
                break;
                case't':case 'T':t++;
                break;
                case'g':case 'G':g++;
                break;
                case'c':case 'C':c++;
                break;
            }
        }
        gcp=g+c;
        gcp=(gcp/n)*100;
        System.out.println("The DNA sequence is: "+ DNA);
        System.out.println("The total number of bases are: "+ n);
        System.out.println("The adenine count is: "+ a);
        System.out.println("The thymine count is: "+ t);
        System.out.println("The guanine count is: "+ g);
        System.out.println("The cytosine count is: "+ c);
        System.out.println("The GC percentage is: "+ gcp);
        }
}

