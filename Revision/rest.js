function add(b,...a){                       //rest parameter
    var result = 0;
    for(var i = 0; i < a.length; i++)
        result = result + a[i];
    console.log("Result : "+result);    
}

add(10,20);
add(10);
add(10,20,30,40,50,60,70,80,90);