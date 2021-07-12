package subtask2


class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val list = decompose(number - 1, number * number)
        return list?.toTypedArray()
    }

    private fun decompose(i: Int, to: Int): MutableList<Int>? {
        if (to == 0) {
            return ArrayList()
        }
        if (i <= 0 || to < 0) {
            return null
        }

        val list = decompose(i - 1, to - i * i)
        if (list != null) {
            list.add(i)
            return list
        }
        return decompose(i - 1, to)
    }

}
