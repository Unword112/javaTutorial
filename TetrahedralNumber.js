function tetra(n) {
    var sum = 0;
    for(let i=1;i<=n;i++){
        for(let j=1;j<=i;j++){
            for(let k=1;k<=j;k++){
                sum++
            }
        }
    }
    return sum
}

console.log(tetra(5))
console.log(tetra(6))
console.log(tetra(7))
