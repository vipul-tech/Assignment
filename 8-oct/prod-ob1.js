let product = {  
   prodid:101,
   prodname:'Samsung',
   price:12999,
   category:'Mobiles',
   freeDeliveryEligible:true,
   codEligible:false,
   showProductDetails: function() {
    console.log(this.prodid, this.prodname, this.price, this.category, this.freeDeliveryEligible, this.codEligible )
   }     
} 

product.showProductDetails()
console.log(product.category)
console.log(product['category'], product['price'])
product.category='Electronics'
console.log(product.category)
