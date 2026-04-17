var mysql = require('mysql2');
var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    database:'mydb',
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
var sql = "select * from Students";
con.query(sql,function(err, result){
    if(err){
        console.log(err);
        return;
    }
    else{
        console.log(result);
    }
});

con.end();