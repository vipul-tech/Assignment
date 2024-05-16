let numbers = [1,2,3,4,5,6]
console.log(numbers.length)
//numbers.length=0
console.log('  '+numbers.length)
console.log(numbers)

numbers.push(7)
console.log('--- push operation----')
console.log(numbers)

numbers.unshift(10)
console.log('--- unshift operation----')
console.log(numbers)

let x = numbers.pop()
console.log(`popped  element = ${x}`)

let y = numbers.shift()
console.log(`shifted  element = ${y}`)

console.log('---array of pop and shift ----')
console.log(numbers)



