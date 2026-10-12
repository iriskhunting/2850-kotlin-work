// Task 7.7.1: statistics functions

fun median(nums: List<Float>): Float {
    var med = 0.0.toFloat()
    val sortNums = nums.sorted()
    if (sortNums.size % 2 == 0) {
        med = sortNums[sortNums.size/2]
    }
    else {
        med = sortNums[(sortNums.size + 1)/2]
    }
    
    return med
}