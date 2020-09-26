package String;

import java.util.HashMap;
import java.util.Map;

public class SherlockNValidString {

	public static String isValid(String s) {
		Map<Character, Integer> map = new HashMap<>();// get the count of each chars
		
		for(int i = 0 ; i < s.length() ; i++) 
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		int curr = map.get(s.charAt(0)), remove1Done = 0;
		
		for(int i : map.values()) {
			if(curr == i) continue; // values are same as first count..
			else {// not the same as the first value.. handle the cases
				if(i == curr+1) {// case where there is only one count higher
					if(remove1Done == 0) {// not yet removed 1
						remove1Done = 1;
						continue;
					}
					else return "NO";// already done so no chance
				}
				if(remove1Done == 0 && i == 1) {
					remove1Done = 1;
					continue;
				}
				if((curr - i) > 1 || (i - curr) < 0 || curr - i < 0) {// where the difference is more
					return "NO";
				}
			}
		}
		return "YES";
	}
	
	public static void main(String[] args) {
		//ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd
		System.out.println(isValid("abbccc"));
	}
}
