let CartProducts=[];
let products= JSON.parse(sessionStorage.getItem('products'));

let queryString = window.location.search;
let queryParams = new URLSearchParams(queryString);

let productName = queryParams.get('ProductName')
let findProduct = products.find(x=> x.ProductName===productName);
window.onload = function(){
    document.getElementById("inp-prodname").value = findProduct.ProductName;
    document.getElementById("inp-prodid").value= findProduct.ProductID;
    document.getElementById("inp-price").value = findProduct.Price;
}
document.getElementById('cart').addEventListener('click',()=>{
    let Cart = JSON.parse(sessionStorage.getItem('CartProducts'));
   // alert(JSON.stringify(Cart));
    let prodid = document.getElementById('inp-prodid').value;
    let prodname= document.getElementById('inp-prodname').value;
    let price= document.getElementById('inp-price').value;
    if(Cart==null){
        CartProducts.push({prodid, prodname, price});
        sessionStorage.setItem('CartProducts', JSON.stringify(CartProducts));
    }
    Cart.push({prodid, prodname, price});
    sessionStorage.setItem('CartProducts', JSON.stringify(Cart));
    //console.log(CartProducts);
});

