function Person (firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

Person.prototype.fullName = function() {
    return this.firstName + " " + this.lastName;
}

Person.prototype.country = "Poland";

let p1 = new Person("Jan", "Kowalski");
let p2 = new Person("Jan", "Kowalski");

console.log(p1.fullName === p2.fullName);
console.log(p2.fullName() === p2.fullName());

console.log(p1.country);

function Student (fn, ln, id) {
    Person.call(this, fn, ln);
    this.id = id;
}

Student.prototype = Object.create(Person.prototype);
Student.prototype.fullInfo = function() {
    return this.firstName + " " + this.lastName + " " + this.id;
}

let s1 = new Student("Kingeł", "Mocarna", 1);
console.log(s1.fullInfo());
console.log(p1.fullName());
