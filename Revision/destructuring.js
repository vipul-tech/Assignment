arr1 = [10,20,30]
arr2 = [40,50,60,70]
arr3 = [80,90]

arr = [arr1, arr2, arr3]
console.log("Jacked Array : ")
console.log(arr)
narr = [...arr1, ...arr2, ...arr3]
console.log("Destructuring an array : ")
console.log(narr)

var person = {'name':'Anmol','age':22,'salary':40000,'desig':'Manager'}
var {name,age,salary,desig} = person
console.log("Destructuring an object")
console.log(name)
console.log(age)
console.log(salary)
console.log(desig)