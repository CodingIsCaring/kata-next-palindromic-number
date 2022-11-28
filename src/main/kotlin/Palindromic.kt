class Palindromic {
    companion object {
        fun getNext(value: Int): Int {
            val nextValue = value + 1
            if (!isPalindromic(nextValue.toString(), 0, nextValue.toString().length - 1)) {
                return getNext(nextValue)
            }
            return nextValue
        }

        private fun isPalindromic(value: String, start: Int, end: Int): Boolean {
            if (!hasDigitsToCheck(start, end)) {
                return true
            }
            if (!areDigitsEquals(value, start, end)) {
                return false
            }
            if (canCheckNextDigits(start, end)) {
                return isPalindromic(value, start + 1, end - 1)
            }
            return true
        }

        private fun canCheckNextDigits(start: Int, end: Int) = (start + 1) < (end - 1)

        private fun areDigitsEquals(value: String, start: Int, end: Int) = value[start] == value[end]

        private fun hasDigitsToCheck(start: Int, end: Int) = start != end && start < end
    }

}
