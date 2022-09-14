package programmersone

class SumDigit_0914 {
    fun solution(n: Int): Int {
        var answer = 0

        for(strNum in n.toString()){
            answer += strNum.digitToInt()
        }

        return answer
    }
}
