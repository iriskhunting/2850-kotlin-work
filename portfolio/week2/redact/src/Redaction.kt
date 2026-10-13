// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(inputDoc: String, toRedactText: String, toReplaceChar: Char = 'X'): String {
    
    // Create string containing replacement character with same length as text to redact
    val toReplaceText = buildString {
        for (n in 1..toRedactText.length) {
            append(toReplaceChar)
        }
    }

    //val regexToRedactText = Regex.fromLiteral

    val redactDoc = inputDoc.replace(toRedactText, toReplaceText)
    
    
    return redactDoc
}