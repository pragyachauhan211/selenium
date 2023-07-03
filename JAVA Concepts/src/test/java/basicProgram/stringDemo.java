package basicProgram;

public class stringDemo {
	
	public void abc()
	{
		  String s = "JP Morgan Mumbai pawai Lake"; // input
			
			String s2 = "PJ NagroM IabmuM PaWaI La"; // output
			
			String s3[] = s.split(" ");
			String s4 = s3[0];
			//System.out.println(s4);
			
			StringBuilder sb = new StringBuilder(s4);
			sb.reverse();
			String s5 = sb.toString();
			//System.out.println(s5); // PJ
			
			String s6 = s3[1];
			StringBuilder sb2 = new StringBuilder(s6);
			sb2.reverse();
			String s7 = sb2.toString();
			//System.out.println(s7); 
			
			String s8 = s7.substring(0,1).toUpperCase()+s7.substring(1);
			//System.out.println(s8); // NagroM
			
			String s9 = s3[2];
			StringBuilder sb3 = new StringBuilder(s9);
			sb3.reverse();
			String s10 = sb3.toString();
			//System.out.println(s10); 
			
			String s11 = s10.substring(0,1).toUpperCase()+s10.substring(1);
			//System.out.println(s11); // IabmuM
			
			String s12 = s3[3];
			char[] ch = s12.toCharArray();
			
			for(int i=0; i<ch.length; i+=2)
			{
				ch[i]= Character.toUpperCase(ch[i]);
			}
			
			String s13 = String.valueOf(ch);
			//String s13= new String(ch);
			//System.out.println(s13); // PaWaI
			
			String s14 = s3[4];
			String s15[] = s14.split("k");
			String s16 = s15[0];
			//System.out.println(s16); // La
			
			String s17 = s5+" "+s8+" "+s11+" "+s13+" "+s16;
			System.out.println(s17);	
			
    }

	public static void main(String[] args) {

		stringDemo sd = new stringDemo();
		sd.abc();
	}

}
