import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import Page from './components/Page'
// import App from './App';
// import Greeting from './components/Greeting'
// import NumberList from './components/NumberList'
// import Blog from './components/Blog'
// import NameForm from './components/NameForm'
// import EssayForm from './components/EssayForm'
// import Reservation from './components/Reservation'
import Calculator from './components/Calculator'
import * as serviceWorker from './serviceWorker';

// const numbers = [1,2,3,4,5];
// const posts = [
//   {id : 1, title: "welcome1", content : "contentf shfjkdhs df sdhfjsd ffshdhfkjs "},
//   {id : 2, title: "welcome2", content : "njbd fjsgfhjg gfugf gjsjk"}
// ]
ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Greeting /> */}
    {/* <Page /> */}
    {/* <NumberList numbers={numbers}/> */}
    {/* <Blog posts={posts} /> */}
    {/* <NameForm /> */}
    {/* <EssayForm /> */}
    <Calculator />
    {/* <Reservation /> */}
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
