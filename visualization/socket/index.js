var express = require('express');
var bodyParser = require('body-parser');
var app = express();
var http = require('http').Server(app);
var io = require('socket.io')(http);

app.use(bodyParser.json());

app.get('/', function(req, res){
  res.sendFile('index.html', { root: __dirname });
});

app.post('/data', function (req, res) {
	console.log(req.body);
	io.emit('data', { body: req.body });
	res.send('200 OK');
});

io.on('connection', function(socket){
  console.log('a user connected');
  socket.on('disconnect', function(){
    console.log('user disconnected');
  });
  socket.on('chat message', function(msg){
    console.log('message: ' + msg);
    io.emit('chat message', msg);
  });
});

http.listen(3000, function(){
  console.log('listening on *:3000');
});