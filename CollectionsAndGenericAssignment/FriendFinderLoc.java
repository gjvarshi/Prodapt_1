package CollectionAndGenericAssignment;

class FriendshipCriteria<T extends Comparable<T>, S extends Comparable<S>>{
	private T name;
	private S variable;
	
	public FriendshipCriteria(T name, S variable) {
		super();
		this.name = name;
		this.variable = variable;
	}
 
	public T getName() {
		return name;
	}
 
	public S getVariable() {
		return variable;
	}
 
}

class FriendFinder {
    public static void main(String[] args) {       
    	FriendshipCriteria<String, Integer> frnd1 = new FriendshipCriteria<>("Vijay", 45);
        FriendshipCriteria<String, Integer> frnd2 = new FriendshipCriteria<>("Hari", 32);
 
        if (frnd1.getVariable().compareTo(frnd2.getVariable()) > 0) {
            System.out.println(frnd1.getName() + " is older than " + frnd2.getName());
        } else {
            System.out.println(frnd1.getName() + " is younger than " + frnd2.getName());
        }
    }
}

public class FriendFinderLoc {
	public static void main(String[] args) {       
		FriendshipCriteria<String, String> locFrnd1 = new FriendshipCriteria<>("Vijay", "Chennai");
        FriendshipCriteria<String, String> locFrnd2 = new FriendshipCriteria<>("Hari", "Chennai");
        
       
        if (locFrnd1.getVariable().compareTo(locFrnd2.getVariable()) == 0) {
        	System.out.println(locFrnd1.getName() + " and " + locFrnd2.getName() + " are in the same location.");
	    } else {
	        System.out.println(locFrnd1.getName() + " and " + locFrnd2.getName() + " are in different locations.");
	    }
	}
}
