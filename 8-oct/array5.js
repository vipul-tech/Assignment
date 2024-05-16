let numbers = [1,2,3,4,5]

//numbers.map( function(e,i,arra){  })

let squares = numbers.map(e=>e*2)
squares.forEach(e=>console.log(e))


let products = [
    {prodid:101,pname:'Samsung',price:12999},
    {prodid:104,pname:'Apple',price:50000},
    {prodid:102,pname:'Headset',price:500},
    {prodid:105,pname:'Charger',price:1200},
    {prodid:103,pname:'USBcable',price:250},
]

products.map(p=>{
    p.price += 10
    return p
}).forEach(p=>console.log(p.prodid,p.pname,p.price))

//updatedPriceProducts.forEach(p=>console.log(p.prodid,p.pname,p.price))
