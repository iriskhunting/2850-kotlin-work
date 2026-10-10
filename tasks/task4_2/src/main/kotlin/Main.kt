// Task 4.2: use of if and ranges

fun main() {
    // menu
    val menu = """**** Pizza Menu **** 
            (a) Margherita
            (b) Pepperoni
            (c) Meat Feast
            (d) Veggie  """
    println(menu)

    // user input
    print("Choose your pizza (a-d): ")
    val choice = readln().lowercase()

    var message = ""
    if (choice.length == 1 && choice[0] in 'a'..'d') {
        message = "Order accepted"
    }

    else {
        message = "Invalid choice!"
    }

    println(message)

}
