package programmersone

class HarshadNumber_0915 {
    fun solution(x: Int): Boolean {
        val digitSum = x.toString().toList().map{it.digitToInt()}.sum()
        return x % digitSum == 0
    }
}