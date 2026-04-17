var mysql = require('mysql2');
var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'Saumya@3045',
    port:3306
});
con.connect(function(err){
    if(err){
        console.log(err);
        return;
    }
    console.log("Connected to database successfully");
});
con.query("Create database mydb", function(err, result){
    if(err){
        console.log(err);
        return;
    }
    console.log("Database created successfully");
});
con.end();