const DayName = (str) => {
    const date = new Date(str);

    const option = {
        weekday: ''
    };

    return new Intl.DateTimeFormat('en-US', option).format(date)
} 

console.log(DayName(    ))