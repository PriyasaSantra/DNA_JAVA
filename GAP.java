
//CALCULATE GAP PERCENTAGE 
public class GAP{
    
    public static void main(String[] args){
       
       int a=0;
       int n=0;
       
       float ans;
       String DNA="aaatgc ggcct ggcaaatg atgcccgca aatgcggt";
       n=DNA.length();
       System.out.println("the length of DNA sequence is: "+ n);
       
       for(int i=0;i<DNA.length();i++)
       {
           if(DNA.charAt(i)==' ')
           a++;
         }
        System.out.println("the no. of gaps in the sequence are: "+ a); 
       ans=(float)a/n;
       System.out.println("the percentage of gaps in the sequence is: "+ ans); 
    }
}

