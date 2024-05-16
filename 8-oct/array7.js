let numbers = [2,3,4,5,6,7,8,9,10]

let x = numbers.every(e=>e>1)
console.log(x)




let products = [
    {prodid:101,pname:'Samsung',price:12999},
    {prodid:104,pname:'Apple',price:50000},
    {prodid:102,pname:'Headset',price:500},
    {prodid:105,pname:'Charger',price:1200},
    {prodid:103,pname:'USBcable',price:250},
]

let y = products.some(p=>p.price>500)
console.log('prod some = ' + y)

let foundProduct = products.find(p=>p.prodid===102)
console.log(foundProduct.prodid,foundProduct.pname,foundProduct.price)

let prodIndex = products.findIndex(p=>p.prodid===102)
console.log(prodIndex)