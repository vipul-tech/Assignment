let products= [
    {SerialNo: 1, ProductID: 101, ProductName: "Laptop", Price: 75000},
    {SerialNo: 2, ProductID: 102, ProductName: "Mobile", Price: 25000},
    {SerialNo: 3, ProductID: 103, ProductName: "Tablet", Price: 38000},
    {SerialNo: 4, ProductID: 104, ProductName: "Headphone", Price: 4500},
    {SerialNo: 5, ProductID: 105, ProductName: "Adapter", Price: 500},
    {SerialNo: 6, ProductID: 106, ProductName: "Desktop", Price: 85000},
];

let headers=['SerialNo', 'ProductID', 'ProductName', 'Price'];
let LoadProduct = function(){
    // Used for store data to session storage
    let tempProducts= sessionStorage.getItem('products');
    if(tempProducts==null) {
        sessionStorage.setItem('products',JSON.stringify(products));
    }
    // Code for creating Dynamic Table of Product Data.
    let table= document.getElementById('table');
    let headerRow = document.createElement('tr');
    
    headers.forEach(headerText =>{
        let header= document.createElement('th');
        let text= document.createTextNode(headerText);
        header.appendChild(text);
        headerRow.appendChild(header);
    });
    table.appendChild(headerRow);
    products.forEach(prod =>{
        let row= document.createElement('tr')
        Object.values(prod).forEach(text =>{
            if(text== prod.ProductName){
                let cell= document.createElement('td');
                let infotag= document.createElement('a');
                let textnode= document.createTextNode(text);
                infotag.href=`productDetails.html?ProductName=${prod.ProductName}`;
                infotag.appendChild(textnode);
                cell.appendChild(infotag);
                row.appendChild(cell);
            }
            else{
            let cell= document.createElement('td');
            let tdata= document.createTextNode(text);
            // infotag.appendChild()
            cell.appendChild(tdata);
            row.appendChild(cell);
        }
        })
        table.appendChild(row);
    });
}
window.onload= LoadProduct;