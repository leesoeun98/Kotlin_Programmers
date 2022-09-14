package programmersone

class CheckRoot_0915 {
    fun solution(n: Long): Long {
        // 1로 나눠도 나머지가 0이면 정수
        return if(Math.sqrt(n.toDouble()) % 1.0 == 0.0) Math.pow(Math.sqrt(n.toDouble())+1,2.0).toLong() else -1
    }
}