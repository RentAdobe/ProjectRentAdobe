import React from 'react';
import './App.css';
import {BrowserRouter as Router,Switch,Route} from 'react-router-dom';
import Dashboard from 'component/dashboard/dashboard'
import Login from 'component/login/login'
import Tenant from 'component/Tenant/Tenant'
import AddTenant from 'component/Tenant/AddTenant'
import Payment from 'component/payment/payment'
import NewPayment from 'component/payment/newPayment'
import ElectricMeterReading from 'component/utility/ElectricMeterReading'
import ShowTenant from 'component/Tenant/ShowTenant'
import EditTenant from 'component/Tenant/EditTenant'
import Home from 'component/home/Home';


export default class App extends React.Component {
    render() {
      return(
        <Router>
        <div className="App">
          <Switch>
            <Route path='/' exact component={Login} />
            <Route path='/home' component={Home} />
            <Route path='/dashboard' component={Dashboard} />
            <Route path='/tenant' exact component={Tenant} />
            <Route path='/tenant/create' component={AddTenant} />
            <Route path='/tenant/show/:id' component={ShowTenant} />
            <Route path='/tenant/edit/:id' component={EditTenant} />
            <Route path='/payment' exact component={Payment} />
            <Route path='/payment/makePayment' component={NewPayment} />
            <Route path='/electric' component={ElectricMeterReading} />
          </Switch>
        </div>
      </Router>
      )
    }
}


