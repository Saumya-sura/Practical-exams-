var fs = require('fs');
var http = require('http');
http.createServer(function (req, res) {
    fs.readFile('nodejs/test.txt', 'utf8', function(err,data){
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(data);
    return res.end();
});
}).listen(8081);
/*

fs.readFile('nodejs/test.txt', 'utf8', function(err,data){
    if(err){
        console.log(err);
    }
    console.log(data);
});
*/