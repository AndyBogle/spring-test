function loadStarbucks() {

//$.ajax({
//  accepts: {
//    mycustomtype: 'application/x-some-custom-type'
//  },
//
//  // Instructions for how to deserialize a `mycustomtype`
//  converters: {
//    'text mycustomtype': function(result) {
//      // Do Stuff
//      return newresult;
//    }
//  },
//
//  // Expect a `mycustomtype` back from server
//  dataType: 'mycustomtype'
//});

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


//return CsvStarbucks
 return alert("I am an alert box!");
}