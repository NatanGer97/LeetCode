const person  = {
    name : "Natan"  
}

const person1 = person;
person1.name = "Nathan"

console.log(person);

const personeCopy = {...person}
personeCopy.name = "Natan"
console.log(personeCopy);
