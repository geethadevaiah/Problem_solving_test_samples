// Solidity program to demonstrate Addition 
pragma solidity 0.6.6; 
contract AdditionExample  
{ 
    // Intializing the 
    // state variables 
    int8 firstNo=2 ; 
    int8 secondNo=6; 
      
    // Defining a function 
    // to add two numbers 
    function Add() view public returns (int8)  
    { 
        int8 ans = firstNo + secondNo ; 
          
        // sum amount 
        return ans; 
    } 
  
}