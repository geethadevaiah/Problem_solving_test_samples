package String;

import java.util.HashMap;
import java.util.Map;

public class SherlockNValidString {

	public static String isValid(String s) {
		// get the count of each chars
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		int curr = map.get(s.charAt(0));
		int count = 0, firstCnt = 0, secondCnt = 0;
		for(int i : map.values()) {
			if(curr != i) {
				// first change has occurred
				if(firstCnt == 0) firstCnt = i;
				else if(firstCnt != 0 && secondCnt == 0) {
					secondCnt = i;
				}
				else if(secondCnt != 0) {
					// this is third change but check if it equal to firstChange only
					if(firstCnt == i) {
						firstCnt = secondCnt;
						secondCnt = 0;
						count = 1;
					}
				}
				count++;
				if(count > 1) return "NO";
				if(Math.abs(curr - i) > 1 && i != 1) return "NO";
			}
		}
		System.out.println(count);
		return "YES";
	}
	
	public static void main(String[] args) {
		//ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd
		System.out.println(isValid("aaabbbccciiisssll"));
	}
}
