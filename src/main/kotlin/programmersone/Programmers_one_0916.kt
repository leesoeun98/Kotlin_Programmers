package programmersone

class Programmers_one_0917 {
    fun changeStringToInteger(s: String): Int {
        return if(s[0].equals("-")) -Math.abs(s.toInt()) else s.toInt()
    }

    //lambda 식 쓰기!!
    // array 초기화 시 n번 반복해서 {} 내용으로 초기화 가능
    fun xIntervalNumber(x: Int, n: Int): LongArray  = LongArray(n) {x.toLong() * (it+1)}

    //start, end 정하고 sum()쓰면 속도 개선됨
    //type 주의
    fun sumOfBetweenTwoInteger(a: Int, b: Int): Long {
        val start: Long = (if(a>b) b else a).toLong()
        val end: Long = (if(a>b) a else b).toLong()
        return (start..end).sum()
    }

    // fold 함수 써서 target인 total에 초기값을 세팅하고 absolutes함수를 순회해서 num 값을 더하자
    // fold가 빠름!
    fun sumNegativeAndPositive(absolutes: IntArray, signs: BooleanArray) =
        absolutes.foldIndexed(0){idx, total, num -> total + if(signs[idx]) num else -num}


    fun removeMinNumber(arr: IntArray): IntArray {
        return if(arr.size==1) intArrayOf(-1) else arr.filter { it != arr.minOrNull() }.toIntArray()
    }

    // Kotlin스럽게 filter쓰기
    fun numberArrayRemainder(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter{it % divisor == 0 }.sorted().toIntArray()
        return if(answer.size==0) intArrayOf(-1) else answer
    }

    // 문자열 반복은 repeat함수 쓰기
    // slicing 대신 substring
    fun maskingPhoneNumber(phone_number: String): String =  "*".repeat(phone_number.length-4) + phone_number.substring(phone_number.length-4)

    // Kotlin은 ; 필요 없음
    // return 바로 해버리자
    // for문에 ..은 끝수도 포함 (until 은 미포함)
    fun findRemainder1(n: Int): Int {
        //2로 해야 더 빠름
        for(x in 2..n){
            if(n%x==1) return x
        }
        return 1
    }

    // overflow 조심 ㅠㅠ python에서는 신경쓰지 않았는데
    // kotlin에서는 변수의 범위부터 확인해야 함
    // 만약 코틀린의 재귀 호출이 마지막 위치하면 tailrec 키워드를 써서 더 간단히 가능
    // Kotlin 스럽게 풀자! (시간도 그냥 while문 500번 돌리는거보다 빠름)
    fun collatzConjecture(num: Int): Int = collatzAlgorithm(num.toLong(), 0)

    tailrec fun collatzAlgorithm(num:Long, count:Int) : Int =
        when{
            count >500 -> -1
            num == 1L -> count
            else -> collatzAlgorithm(if(num%2==0L) num/2 else (num*3)+1, count+1)
        }

    // Kotlin스럽게 풀기, indexOf 사용, String format 사
    fun findKim(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"

}