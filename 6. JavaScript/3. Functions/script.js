function yearType(year) {
const yearLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
const yearType = yearLeap ? "Przestępny" : "Nieprzestępny";
console.log(year + " jest " + yearType);
}
yearType(1934);
yearType(1988);
yearType(2012);
console.log("------------")
function isLeap (year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
}

function getYearType (year) {
    return isLeap(year) ? "Przestępny" : "Nieprzestępny";
}

function printYearInfo (year) {
    console.log(year + " jest " + getYearType(year));
}

printYearInfo(1934);
printYearInfo(1988);
printYearInfo(2021);
