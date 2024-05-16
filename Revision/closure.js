// function abc(){
//     var a = 0;
//     function plus(){
//         a = a + 1;
//         console.log(a);
//     }
//     return plus;
// }

var incr = function abc(){
    var a = 0;
    function plus(){
        a = a + 1;
        console.log(a);
    }
    return plus;
}()

//var incr = abc();
incr();
incr();
incr();
incr();