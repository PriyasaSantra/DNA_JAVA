//COMPLEMENT DNA SEQUENCE 
public class COMPLEMENT{
    public static void main(String[] args){
        String DNA="atttgcccaaagcccttgcgtttaattggccagggcccgt";
        int n=DNA.length();
        
        System.out.println("The original DNA sequence is : "+ DNA);
         System.out.println("The complement DNA sequence is :" );
       
       for(int i=0;i<n;i++)
       {
           switch(DNA.charAt(i))
           {
               case 'a': case'A':System.out.print("t");
               break;
               case 't': case'T':System.out.print("a");
               break;
               case 'g': case'G':System.out.print("c");
               break;
               case 'c': case'C':System.out.print("g");
               break;
           }
       }
        
        }
}
