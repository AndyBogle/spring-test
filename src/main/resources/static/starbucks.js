function loadStarbucks() {

$.ajax({
  url: "http://127.0.0.1:8080/starbucks"
}).done(function(result) {
    console.log(result);
});

//$.ajax({
//  url: 127.0.0.1:8080/map.html,
//  data: List<CsvStarbucks> ,
//  success: getStarbucks(),
//  dataType: ArrayList<>()
//});



 //return alert("I am an alert box!");
}