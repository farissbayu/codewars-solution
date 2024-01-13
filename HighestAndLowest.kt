fun highAndLow(numbers: String): String {

    // split string into list
    val arr = numbers.split(" ").toList()

    // define initial value for min and max
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    // looping to find the highest and lowest value in arr
    for (a in arr) {
        if (a.toInt() > max) max = a.toInt()
        if (a.toInt() < min) min = a.toInt()
    }

    // return result
    return "$max $min"
}