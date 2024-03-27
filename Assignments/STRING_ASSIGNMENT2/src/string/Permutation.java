package string;

public class Permutation {

	public static void main(String[] args) {
		String B="xyz";
		char a[]=B.toCharArray();
		for(int l=0;l<a.length;l++) {
			for(int m=0;m<a.length;m++) {
				for(int n=0;n<a.length;n++) {
					if(l!=m && m!=n && l!=n) {
					System.out.println(a[l]+""+a[m]+""+a[n]);
				}
			}
		}

	}
  }
}
