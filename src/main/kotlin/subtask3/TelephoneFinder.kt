package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        return generateNumbers(number)
    }

    private fun generateNumbers(number: String): Array<String>? {
        val array = mutableListOf<String>()
        if (number[0] == '-') {
            return null
        } else {
            number.forEachIndexed { index, element ->
                when (element) {
                    '0' -> {
                        println("0")
                        array.add(buildNumberString(number, index, "8"))
                    }
                    '1' -> {
                        println("1")
                        array.add(buildNumberString(number, index, "2"))
                        array.add(buildNumberString(number, index, "4"))
                    }
                    '2' -> {
                        println("2")
                        array.add(buildNumberString(number, index, "1"))
                        array.add(buildNumberString(number, index, "3"))
                        array.add(buildNumberString(number, index, "5"))
                    }
                    '3' -> {
                        println("3")
                        array.add(buildNumberString(number, index, "2"))
                        array.add(buildNumberString(number, index, "6"))
                    }
                    '4' -> {
                        println("4")
                        array.add(buildNumberString(number, index, "1"))
                        array.add(buildNumberString(number, index, "5"))
                        array.add(buildNumberString(number, index, "7"))
                    }
                    '5' -> {
                        println("5")
                        array.add(buildNumberString(number, index, "2"))
                        array.add(buildNumberString(number, index, "4"))
                        array.add(buildNumberString(number, index, "6"))
                        array.add(buildNumberString(number, index, "8"))
                    }
                    '6' -> {
                        println("6")
                        array.add(buildNumberString(number, index, "3"))
                        array.add(buildNumberString(number, index, "5"))
                        array.add(buildNumberString(number, index, "9"))
                    }
                    '7' -> {
                        println("7")
                        array.add(buildNumberString(number, index, "4"))
                        array.add(buildNumberString(number, index, "8"))
                    }
                    '8' -> {
                        println("9")
                        array.add(buildNumberString(number, index, "5"))
                        array.add(buildNumberString(number, index, "7"))
                        array.add(buildNumberString(number, index, "9"))
                        array.add(buildNumberString(number, index, "0"))
                    }
                    '9' -> {
                        println("9")
                        array.add(buildNumberString(number, index, "6"))
                        array.add(buildNumberString(number, index, "8"))
                    }
                }
            }
        }
        return array.toTypedArray()
    }

    private fun buildNumberString(numberStr: String, index: Int, num: String): String {
        return buildString {
            for (i in numberStr.indices) {
                if (numberStr[index] == numberStr[i]) {
                    append(num)
                } else {
                    append(numberStr[i])
                }
            }
        }
    }
}
