var fs = require('fs');
fs.rename('nodejs/test2.txt', 'nodejs/test3.txt', function(err){
    if(err){
        console.log(err);
        return;
    }
    console.log("File renamed successfully");
});
fs.unlink('nodejs/test3.txt', function(err){
    if(err){
        console.log(err);
    }
    console.log("File deleted successfully");

});