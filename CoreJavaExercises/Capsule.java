package exercise;

public class Capsule {
	public static int ncapsule=0;
	public double volume;
    public String screenTest;
    public Capsule(double volume,String s) {
    	this.volume=volume;
    	screenTest=s;
    	ncapsule++;
    }
    public static void main(String[] args) {
    	int[] nlnpack= {5,10,10};
    	Capsule[][] pack= new Capsule[3][];
    	for(int i=0;i<pack.length;i++) {
    		pack[i]=new Capsule[nlnpack[i]];
    		for(int j=0;j<pack[i].length;j++) {
    			pack[i][j]=new Capsule(0.5,"Formular"+i+j);
    		}
       }
    	System.out.println(Capsule.ncapsule);
    }
}
