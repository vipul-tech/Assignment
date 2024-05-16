let prog = ['Java','Angular','ReactJS','Python']
prog.sort()
prog.forEach(e=>console.log(e))


let numbers = [100,20,45,55]
numbers.sort((a,b)=>a-b)
numbers.forEach(e=>console.log(e))


let products = [
    {prodid:101,pname:'Samsung',price:12999},
    {prodid:104,pname:'Apple',price:50000},
    {prodid:102,pname:'Headset',price:500},
    {prodid:105,pname:'Charger',price:1200},
    {prodid:103,pname:'USBcable',price:250},
]
products.sort((p1,p2)=> {
    if(p1.prodid > p2.prodid) { return 1}
    if(p1.prodid < p2.prodid) { return -1}
    return 0
})

products.forEach(p=>console.log(p.prodid,p.pname,p.price))