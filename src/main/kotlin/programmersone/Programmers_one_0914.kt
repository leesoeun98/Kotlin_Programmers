package programmersone

class Programmers_one_0914 {

    fun oddandEven(num: Int):String{
        return if(num%2==0) "Even" else "Odd"
    }

    fun sumDigit(n: Int): Int {
        var answer = 0
        for(strNum in n.toString()){
            answer += strNum.digitToInt()
        }
        return answer
    }

    fun sumDivisor(n: Int): Int {
        var answer = 0
        for(i in 1 until n+1){
            if(n%i==0)
                answer+=i
        }
        return answer
    }

}