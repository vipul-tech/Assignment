let products = [
    {
        productId : 102,
        productName : "Oppo",
        price : 12000,
        category : "Mobile",
        freeDeliveryEligible:true,
        codEligible:false
    },
    {
        productId : 113,
        productName : "LG",
        price : 52000,
        category : "Refrigerator",
        freeDeliveryEligible:true,
        codEligible:false
    },
    {
        productId : 143,
        productName : "Whirlpool",
        price : 22000,
        category : "Washing Machine",
        freeDeliveryEligible:true,
        codEligible:false
    },
    
    {
        productId : 121, 
        productName : "Syska", 
        price : 120, 
        category : "LED", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 124, 
        productName : "LG", 
        price : 20000, 
        category : "Television", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 131, 
        productName : "Usha", 
        price : 1200, 
        category : "Fan", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 137, 
        productName : "Philips", 
        price : 180, 
        category : "CFL", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 133, 
        productName : "Redmi", 
        price : 19000, 
        category : "Tablet", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 114, 
        productName : "Philips", 
        price : 400, 
        category : "Kettle", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 107, 
        productName : "Samsung", 
        price : 32000, 
        category : "Tablet", 
        freeDeliveryEligible:true, 
        codEligible:false
    },
    {
        productId : 127, 
        productName : "Dell", 
        price : 72000, 
        category : "Laptop", 
        freeDeliveryEligible:true, 
        codEligible:false
    }
]

console.log("Original size of product array : "+products.length);

products.push({
    productId : 148, 
    productName : "Bajaj", 
    price : 1500, 
    category : "Electric Iron", 
    freeDeliveryEligible:true, 
    codEligible:false
});

console.log("After push operation size of array : "+products.length);

let x = products.pop();
console.log("After pop operation size of array : "+products.length);
console.log("Poped element : ");
console.log(x);

products.unshift({
    productId : 111, 
    productName : "Samsung", 
    price : 18000, 
    category : "Mobile", 
    freeDeliveryEligible:true, 
    codEligible:false
});

console.log("After unshift operation size of array : "+products.length);

let y = products.shift();
console.log("After shift operation size of array : "+products.length);
console.log("Shifted element : ");
console.log(y);

products.splice(3,0,{
    productId : 105,
    productName : "HP",
    price : 62000,
    category : "Laptop",
    freeDeliveryEligible:true,
    codEligible:false
},
{
    productId : 119, 
    productName : "Lenovo", 
    price : 72000, 
    category : "Laptop", 
    freeDeliveryEligible:true, 
    codEligible:false
});
console.log("After splice at 3rd position size of array : "+products.length);

const prod = products.slice(11);

console.log("Sliced Array : ");
console.log(prod);

products.sort(function(p1,p2){
    return p1.productId-p2.productId
});
console.log("After sorting based on product id : ");
console.log(products);

products.sort((a, b)=>{
    let x = a.productName.toLowerCase();
    let y = b.productName.toLowerCase();
    if (x < y) {return -1;}
    if (x > y) {return 1;}
    return 0;
});
console.log("After sorting based on product name : ");
console.log(products);

products.sort(function(p1,p2){
    return p1.price-p2.price
});
console.log("After sorting based on price: ");
console.log(products);

products.sort((a, b)=>{
    let x = a.category.toLowerCase();
    let y = b.category.toLowerCase();
    if (x < y) {return -1;}
    if (x > y) {return 1;}
    return 0;
});

console.log("After sorting based on category : ");
console.log(products);

console.log("Products Category : ");
products.forEach((p)=>{console.log(p.category)});

console.log();
console.log("Products Price : ");
products.forEach((p)=>{console.log(p.productName+" "+p.price)});

console.log();
console.log("Price of each item increased by 200 : ");
products.map((p)=>{p.price+=200});
products.forEach((p)=>{console.log(p.productName+" "+p.price)});

const pro = products.filter((p)=>{return p.price>30000});
console.log(pro);

let p = products.every((p)=>{return p.price>1000});
console.log("All elements price greater than 1000 : "+p);

let q = products.every((p)=>{return p.price>0});
console.log("All elements price greater than 100 : "+p);

let r = products.some((p)=>{return p.price>1000});
console.log("Some elements price greater than 1000 : "+p);

let s = products.some((p)=>{return p.price<=100});
console.log("Some elements price lesser than 100 : "+p);

let foundProduct = products.find(p=>p.productId===143)
console.log(foundProduct.productId,foundProduct.productName,foundProduct.price)

let prodIndex = products.findIndex(p=>p.productId===143)
console.log(prodIndex)

let lastfoundProduct = products.lastIndexOf(products[2])
console.log(lastfoundProduct);

let proIndex = products.indexOf(p=>p.productId===102)
console.log(proIndex+1)