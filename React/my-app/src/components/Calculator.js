import React, { Component } from 'react'
function BoilingVerdict (props){
    if(props.celsius >= 100)
        return <p>The water is Boiling</p>
    else
        return <p>Water is NOT boiling!</p>
}

class Calculator extends Component{
    constructor(props) {
        super(props);
        this.handleChange = this.handleChange.bind(this);
        this.state = {temperature : ''};
    }

    handleChange(event) {
        this.setState({temperature : event.target.value})
    }

    render() {
        const temperature = this.state.temperature
        return(
        <fieldset>
            <legend>Enter the temprature in celsius : </legend>
            <input value={temperature} onChange={this.handleChange} />
            <BoilingVerdict celsius = {parseFloat(temperature)} />
        </fieldset>
        );
    }
}


export default Calculator
