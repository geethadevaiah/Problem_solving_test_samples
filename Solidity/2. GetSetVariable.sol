pragma solidity ^0.6.0;

contract getSetVariable{
	string public myString = "Hello World";
	
	function getMyString() public view returns(string){
		return myString;
	}
	
	function setMyString(String newMyString) public {
		myString = newMyString;
	}
}