package programmersone

class ReverseNumberMakingArray_0915 {
    fun solution(n: Long): IntArray {
        var answer = mutableListOf<Int>()
        for(strNum in n.toString().reversed()){
            answer.add(strNum.digitToInt())
        }
        return answer.toIntArray()
    }
}