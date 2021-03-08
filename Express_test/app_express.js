const express = require('express');//path to express module
const path = require('path');
const app = express();
var server = require('http').Server(app);


app.use(express.static(path.join(__dirname, 'public')));

app.get('/', function(req, res){
  res.sendFile(__dirname + '/index.html');
});

server.listen(3001, function(){
  console.log('listening on *:3001');
});