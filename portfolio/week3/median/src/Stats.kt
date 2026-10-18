// Task 7.7.1: statistics functions

fun median(nums: List<Double>): Double {
    
    require(nums.size > 0)
    
    var med = 0.0
    val sortNums = nums.sorted()
    if (sortNums.size % 2 == 0) {
        med = sortNums[(sortNums.size/2 - 1)]
    }
    else {
        med = sortNums[((sortNums.size + 1)/2 - 1)]
    }
    
    return med
}