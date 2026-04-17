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
var sql = "Insert into Students(Roll_No, Name, age, address) values ?";
var val = [
    [3, 'Saumya', 20, 'Noida'],
    [4, 'Satyarth', 21, 'Delhi'],
    [5, 'Satyam', 22, 'Gurgaon'],

]
con.query(sql ,[val],function(err, result){
    if(err){
        console.log(err);
        return;
    }
    else{
        console.log("record inserted  successfully");
    }
});