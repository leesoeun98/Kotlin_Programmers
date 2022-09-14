package programmersone

class DescendingNumber_0915 {
//    fun solution(n: Long): Long {
//        var answer = mutableListOf<Char>()
//        for(strNum in n.toString().toList().sorted().reversed())
//            answer.add(strNum)
//        return answer.joinToString("").toLong()
//    }
    // 이게 더 간단
    fun solution(n: Long): Long = String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}