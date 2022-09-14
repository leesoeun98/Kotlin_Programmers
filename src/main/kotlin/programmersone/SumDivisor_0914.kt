package programmersone

class SumDivisor_0914 {
    fun solution(n: Int): Int {
        var answer = 0

        for(i in 1 until n+1){
            if(n%i==0)
                answer+=i
        }
        return answer
    }
}