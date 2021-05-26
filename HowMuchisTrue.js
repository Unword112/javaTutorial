function countTrue(arr) {
    var result = 0;
    for(let i=0;i<arr.length;i++){
        if(arr[i] == true){
            result+=1
        }
    }
    return result
}

console.log(countTrue([true, false, false, true, false]))