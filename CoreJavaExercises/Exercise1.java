package exercise;
class Exercise{
	public int c,f;
	public int e=2;
	public static int v=6;
}
public class Exercise1 {
	public static void main(String[] args) {
		Exercise instanceA = new Exercise();
		Exercise instanceB = new Exercise();
		instanceA.c=8;
		instanceB.f=instanceA.v;
		instanceA.v++;
		instanceB.c = 10;
        instanceB.f = 90;
        instanceB.v++;
        System.out.println(instanceA.c);
        System.out.println(instanceB.f);
        System.out.println(instanceA.v++);
        System.out.println(instanceB.c);
        System.out.println(instanceB.f);
        System.out.println(instanceB.v++);
	  } 

}
