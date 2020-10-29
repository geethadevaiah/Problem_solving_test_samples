import React, { Component } from 'react'

class EssayForm extends Component{
    constructor(props){
        super(props);
        this.state = {value: 'This is the intitial content to verify!'};
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event){
        this.setState({value : event.target.value});
    }

    handleSubmit(event){
        alert("THis is the essay submitted > "+this.state.value);
        event.preventDefault();
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit}>
                <label>Essay : </label>
            <div>
                <textarea value={this.state.value} onChange={this.handleChange}/>
            </div>
            <input type="submit" value="submit"/>
            </form>
        )
    }
}

export default EssayForm;