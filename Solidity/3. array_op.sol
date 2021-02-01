
pragma solidity ^0.6.0;

contract ArrayExample{
	uint[5] public fixedArray;
	uint[] public dynamicArray;
	function setFixedArray(uint value, uint index) public {
		fixedArray[index] = value;
	}
	function setDynamicArray(uint value) public{
		dynamicArray.push(value);
	}
	function removeValue() public{
		dynamicArray.pop();
	}
}