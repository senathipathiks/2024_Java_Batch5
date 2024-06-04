import React, { Component } from 'react'

export class StateClassEx extends Component {
    constructor() {
        super();
        this.state = { x: "Welcome to my youtube channel" }
    }
    clickHandler() {
        // this.setState({ x:this.state.x = "Thanks for subscribing" })
    }

    render() {
        return (
            <div>
                <h2>{this.state.x}</h2>
                <button onClick={() => { this.clickHandler() }}>Subscribe</button>
            </div>
        )
    }
}

export default StateClassEx
