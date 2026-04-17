var fs = require('fs');
fs.open('nodejs/test2.txt', 'w',function(err, file){
    if(err){
        console.log(err);
        return;
    }
    console.log("File opened successfully");
});

fs.writeFile("nodejs/test2.txt",'hi', function(err){
  if(err){
    console.log(err);
    return;
    }
    console.log("File changed successfully");
});