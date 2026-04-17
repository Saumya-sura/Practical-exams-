var fs = require('fs');
fs.appendFile('nodejs/test2.txt'," hello", function(err){
    if(err){
        console.log(err);
    }
    console.log("Data appended successfully");
});

fs.readFile('nodejs/test2.txt', 'utf8', function(err,data){
    if(err){
        console.log(err);
    }
    console.log(data);
});
