const findSingle =function(arr) {
    return arr.reduce((prev,curr) => prev ^curr);
}

//another solution simple XOR
const findSin =function(arr) {
    let res=0;
    for(let i=0;i<arr.length;i++) {
        res=res^arr[i]
    } return res;
}

let arr=[4,1,2,1,2];
console.log(findSingle(arr));
console.log(findSin(arr));