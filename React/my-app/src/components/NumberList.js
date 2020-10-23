import React from 'react'
function NumberList(props){
    const numbers = props.numbers;
    const listnumbers = numbers.map((number) => 
        <li>{number}</li>
    );
    return (
        <ul>{listnumbers}</ul>
    )
}

export default NumberList



