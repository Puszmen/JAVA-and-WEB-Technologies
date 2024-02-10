function Calc() {
    this.add = function(a, b) {
        return a + b;
    }
    this.multiply = function(a, b) {
        return a * b;
    }
}

let calc = new Calc();
let add = calc.add(10, 5);
console.log(add);
calc.multiply(6, 6);







let myObj = {
    a: "first",
    "b": "second",
    3: "third"
}

let product = {
    name: "Baton",
    price: 2.0,
    categories: ["Słodycze", "Przekąski"],
    producer: {
        name: "Nestle",
        address: "Warszawa"
    }
}

for (key in product) {
    console.log(key + ": " + product[key]);
}

console.log(myObj.a);
console.log(product.producer.name);
console.log(product["name"]);

function Product (name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
}

let prod1 = new Product("Mleko", 2.5, "Nabiał");
let prod2 = new Product("Czekolada", 5, "Słodycze");

console.log(prod1);
console.log(prod2);
