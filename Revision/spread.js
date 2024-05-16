function display(name,age,salary,desig){
    console.log("Name : "+name);
    console.log("Age : "+age);
    console.log("Salary : "+salary);
    console.log("Designation : "+desig);
}

var emp = ["Rohit",28,39000,"Admin"];
display(...emp);                                //spread parameter