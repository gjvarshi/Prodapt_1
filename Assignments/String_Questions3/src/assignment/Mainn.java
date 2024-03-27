package assignment;

public class Mainn {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		System.out.println("*******************************************************************************************************");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));
		System.out.println("*******************************************************************************************************");
		String st = "Was it a car or a cat I saw?";
		System.out.println(st.substring(9,12));
		System.out.println("*******************************************************************************************************");
		String original = "software";
        StringBuffer result = new StringBuffer("hi");
        int index = original.indexOf('a');//5
        result.setCharAt(0, original.charAt(0));//si
        result.setCharAt(1, original.charAt(original.length()-1));//se
        result.insert(1, original.charAt(4));//swe
        result.append(original.substring(1,4));//sweoft
        result.insert(3, (original.substring(index, index+2) + " "));//swear oft
        System.out.println(result);
        System.out.println("********************************************************************************************************");
        String hi = "Hi,";
        String mom = "aunty.";
      
        System.out.println(hi.concat(mom));
       System.out.println("*********************");
       String s="Mr jack sparrow";
       System.out.println(s.substring(0,s.indexOf(" ")));
       System.out.println("*********************");
    StringBuffer sn=new StringBuffer();//tostring(stringbuilder)
    sn.append("hi,");
    sn.append("mommy");
    String r=sn.toString();    
     System.out.println(r);
     System.out.println("***********************************************************************************************************");
 
    


        

	}

}
