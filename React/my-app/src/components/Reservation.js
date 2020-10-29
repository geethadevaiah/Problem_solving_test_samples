import React, { Component } from 'react'

class Reservation extends Component{
    constructor(props)
    {
        super(props);
        this.state = {
            isGoing : true,
            noOfGuests : 2
        }
        this.handleInputChange = this.handleInputChange.bind(this);
        
    }
    handleInputChange(event){
        const target = event.target;
        const value = target.type === "checkbox" ? target.checked : target.value;
        const name = target.name;

        this.setState({
            [name] : value
        })
    }

    render() {
        return (
            <form>
                <label>is Going</label>
                <input type="checkbox" name="isGoing" checked={this.state.isGoing} onChange={this.handleInputChange} />
                <label>No of guests : </label>
                <input type="number" name="noOfGuests" value={this.state.noOfGuests} onChange={this.handleInputChange} />
            </form>
        );
    }
}

export default Reservation;