package String;

import java.util.HashMap;
import java.util.Map;

public class SherlockNValidString {

	public static String isValid(String s) {
		// get the count of each chars
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(map.containsKey(s.charAt(i))) 
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i), 1);
		}
		int curr = map.get(s.charAt(0));
		int count = 0, maxCnt = -1;
		for(int i : map.values()) {
			maxCnt = Math.max(maxCnt, i);
			if(curr != i) {
				count++;
				if(count > 1) return "NO";
				if(Math.abs(curr - i) > 1) return "NO";
			}
		}
		
		return "YES";
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
	}
}
