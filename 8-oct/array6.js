let numbers = [2,3,4,5,6,7,8,9,10]

numbers.filter(e=> e>5).forEach(e=>console.log(e))

let products = [
    {prodid:101,pname:'Samsung',price:12999},
    {prodid:104,pname:'Apple',price:50000},
    {prodid:102,pname:'Headset',price:500},
    {prodid:105,pname:'Charger',price:1200},
    {prodid:103,pname:'USBcable',price:250},
]

products.filter(p => { 
if(p.price>500) {
    return p
}
}).forEach(p => console.log(p.prodid,p.pname,p.price))

