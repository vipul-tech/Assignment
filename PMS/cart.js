let CartProducts = JSON.parse(sessionStorage.getItem('CartProducts'));
// let CartProducts=[];
// let storeProductsToSession = function(){
//     let tempProducts = sessionStorage.getItem('CartProducts')
//     if(tempProducts==null)
//     sessionStorage.setItem('CartProducts', JSON.stringify(CartProducts))
//  }  
let headers=['ProductID', 'ProductName', 'Price'];
Load=function(){
    let table = document.getElementById('table');
    let headerRow= document.createElement('tr');

    headers.forEach(headerText=>{
        let header = document.createElement('th');
        let textnode= document.createTextNode(headerText);
        header.appendChild(textnode);
        headerRow.appendChild(header);
    });
    table.appendChild(headerRow);

    CartProducts.forEach(item=>{
        let row = document.createElement('tr');

        Object.values(item).forEach(temp=>{
            let cell= document.createElement('td');
            let text = document.createTextNode(temp);
            cell.appendChild(text);
            row.appendChild(cell);
        });
        table.appendChild(row);
    });
}
window.onload = Load;