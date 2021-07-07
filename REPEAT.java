public class REPEAT {
	public static void main(String[] args) {
		String seq= "AATAAATCAATGTCAGTATCTACGTAGCAAT";
		String rep= "AT";
		int n = seq.length();
		int m = rep.length();
		int count = 0;
		for(int i=0; i<n; i++) {
		    int j;           
            for (j = 0; j < m; j++) {
                if (seq.charAt(i + j) != rep.charAt(j)) {
                    break;
                }
            }
            if (j == m) {               
                count++;               
                j = 0;               
            }           
		}
		System.out.println("  Your sequence is '" + seq + "'");
	    System.out.println("  Your repeat is '" + rep + "'");
		if(count >= 1)
            System.out.println("  The repeat is present " + count + " time(s)");
        else
            System.out.println("  The repeat is absent");
}
