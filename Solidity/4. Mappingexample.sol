pragma solidity ^0.6.0;
contract MappingExample{
	mapping(uint => bool) public myMapping;
	mapping (address => bool) public myAddress;
	function setValue(uint index) public{
		myMapping[index] = true;
	}
	function setAddressVaule() public{
		myAddress[msg.sender] = true;
	}
}