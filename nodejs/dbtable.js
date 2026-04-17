var mysql = require('mysql2');
var con = mysql.createConnection({
    host:'localhost',
    user:'root',
    password:'Saumya@3045',
    database:'mydb',
    port:3306
});
con.connect(function(err){
    if(err){
        console.log(err);
        return;
    }
    console.log("Connected ");
});
var sql = "create table Students(Roll_No int(3) not null, primary key(Roll_No), Name varchar(20) not null, age int(2) not null,address varchar(250))";
con.query(sql,function(err, result){
    if(err){
        console.log(err);
        return;
    }
    else{
        console.log("Table created successfully");
    }
});