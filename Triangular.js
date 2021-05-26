function triangle(n) {
	var res = 0;
    for(let i=1;i<=n;i++){
        for(let j=1;j<=i;j++){
            res++
        }
    }
    return res
}

console.log(triangle(6))
console.log(triangle(215))
