let array1 = [2,22,222,1,11,111,4,44,4444,56];
let array2 = [1,12,123,2,223,21,44,4444,54,5];

function countOccurences(source, find) {
    let counter = 0;
    for (number of find) {
        if (source.includes(number)) {
            counter++;
        }
    }
    return counter;
}
console.log(countOccurences(array1, array2));

function minMax(array) {
    let min = array[0];
    let max = array[0];
    for (number of array) {
        if (number < min) {
            min = number;
        } if (number > max) {
            max = number;
        }
    }
    return [min, max];
}

console.log(minMax(array1));

function interPlace(array, inter) {
    let result = [];
    for (number of array) {
        result.push(number);
        result.push(inter);
    }
    return result;
}

console.log(interPlace(array2, 1));