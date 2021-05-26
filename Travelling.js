function paths(n) {
    if (n < 0) 
          return -1;
    else if (n == 0) 
        return 1;
    else {
        return (n * paths(n-1));
    }
  }
  console.log(paths(9));
  console.log(paths(8));
  console.log(paths(7));
  console.log(paths(11));
  