package basicProgram;

public class Practice1 
{	
	
public void abc()
{
	String s = "JP Morgan Mumbai pawai Lake"; // input
		
	String s2 = "PJ NagroM IabmuM PaWaI La"; // output
	
	String[] s3 = s.split("\\s");
	String s4 = s3[0];
	
	StringBuilder sb1 = new StringBuilder(s4);
	sb1.reverse();
	String s5 = sb1.toString();
	// System.out.println(s5); // PJ
	
	String s6 = s3[1];
	StringBuilder sb2 = new StringBuilder(s6);
	sb2.reverse();
	String s7 = sb2.toString();
	String s8 = s7.substring(0,1).toUpperCase()+s7.substring(1);
	// System.out.println(s8); // nagroM
	
	String s9 = s3[2];
	StringBuilder sb3 = new StringBuilder(s9);
	sb3.reverse();
	String s10 = sb3.toString();
	String s11 = s10.substring(0,1).toUpperCase()+s10.substring(1);
	 // System.out.println(s11); // IabmuM
	
	
	
	String s13 = s3[3];
	char[] c = s13.toCharArray();
	
	for(int i=0; i<c.length;i+=2)
	{
		c[i] = Character.toUpperCase(c[i]);
	}
	
	String s14 = String.valueOf(c);
	// System.out.println(s14); // PaWaI
	
	String s15 = s3[4];
	String s16 = s15.substring(0,2); // La
	
	String s12 = s5 + " " + s8 + " " + s11 + " " + s14 + " " + s16;
	System.out.println(s12);
	
}	
public static void main(String[] args) 
	{
	Practice1 a = new Practice1();
	a.abc();
	}

}
