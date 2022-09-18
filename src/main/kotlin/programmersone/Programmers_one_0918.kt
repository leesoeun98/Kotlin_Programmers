package programmersone

class Programmers_one_0918 {
    //kotlin스럽게!! CharArray 생성하되 총 n 번 반복, index가 홀 짝이냐에 따라 Char이 달라짐
    fun waterMelon(n: Int): String  = String(CharArray(n) { i -> if (i % 2 == 0) '수' else '박' })

    // 생각보다 매우 매우 느림..20ms (0.02초)
    fun sumOfNotExists(numbers: IntArray): Int = (0..9).filter {i-> !numbers.contains(i) }.sum()

    fun getMiddleString(s: String): String = if(s.length % 2==0) s.substring((s.length/2)-1, s.length/2+1)  else s.substring(s.length/2, s.length/2+1)

    // zip쓰기! 근데 생각보다 오래걸림 6ms
    fun innerProduct(a: IntArray, b: IntArray): Int = a.zip(b){aa, bb -> aa*bb}.sum()

    // 대략 30ms 걸림 ㅠ (map쓰면 오래걸림..)
    // s.toCharArray()가 나음 (이거 쓰면 대략 20ms 이내)
    fun descendingString(s: String): String  = s.map { it.code.toChar() }.sortedDescending().joinToString("")
    fun descendingString2(s: String): String = String(s.toCharArray().sortedArrayDescending())
}