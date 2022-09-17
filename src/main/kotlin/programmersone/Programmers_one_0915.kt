package programmersone

class Programmers_one_0915 {

    fun checkRoot(n: Long): Long {
        // 1로 나눠도 나머지가 0이면 정수
        return if(Math.sqrt(n.toDouble()) % 1.0 == 0.0) Math.pow(Math.sqrt(n.toDouble())+1,2.0).toLong() else -1
    }

    // 이게 더 간단
    fun descendingNumber(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()

    fun getMean(arr: IntArray): Double {
        //return arr.sum() / arr.size.toDouble()
        return arr.average() //내장함수 쓰기
    }

    fun harshadNumber(x: Int): Boolean {
        val digitSum = x.toString().toList().map{it.digitToInt()}.sum()
        return x % digitSum == 0
    }

    fun reverseNumberMakingArray(n: Long): IntArray {
        var answer = mutableListOf<Int>()
        for(strNum in n.toString().reversed()){
            answer.add(strNum.digitToInt())
        }
        return answer.toIntArray()
    }

}