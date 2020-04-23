import React, { Component } from 'react';
import GridComponent from "../common/GridComponent"
import {profile} from "../../constants/profile"
import {
    Switch,
    Route,
  } from "react-router-dom";
import PersonalDetailsPage from "./PersonalDetailsPage";
import { withRouter } from "react-router-dom"
class ProfilePage extends Component {
    render() {
        if(! this.props.logged){
            this.props.history.replace("/login")
        }
        return (
                <Switch>
                    <Route path="/perfil/datos">
                        <PersonalDetailsPage client={this.props.client}/>
                    </Route>
                    <Route path ="/perfil">
                        <GridComponent data={profile} logged={this.props.logged} />
                    </Route>
                </Switch>
        );
    }
}

export default withRouter(ProfilePage);