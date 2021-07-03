package Class_revision.Recursion_and_Backtracking;

public class FriendsParty {
	// given n number friends
	// one can go either single or as a couple
	// find the number of ways n friends can go to a party.
	
	public static int numberofWaysFriendsParty(int n){
		if(n == 1 || n == 2 ) return n;
		
		return numberofWaysFriendsParty(n-1) + (n-1) * numberofWaysFriendsParty(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(numberofWaysFriendsParty(4));
	}
}

// find the number of cases first
// 'A' have two choices.
// 		1. go alone
// 		2. go with pair

// if A decides to go alone, then that is (1 * remaining person {n-1} choices)
// if A decides to pair, then remaining n-1 will people will have {n-2} choices

// ---choice to go alone * remaining ppl choice --- + ----pair up left (n-1) ppl -----
// ------ 1 ------------ * f(n-1) ----------------- + ----(n-1) * f(n-2)--------------
