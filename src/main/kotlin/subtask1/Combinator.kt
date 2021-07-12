package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        return findTheNumberOfProducts(array)
    }

    private fun findTheNumberOfProducts(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]

        for (i in 0..m) {
            if (m == binomialCoefficient(n, i)) {
                return i
            }
        }
        return null
    }

    private fun binomialCoefficient(n: Int, k: Int): Int {
        if (k > n) return 0
        if (k == 0 || k == n) return 1

        // Recur
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k)
    }

}
