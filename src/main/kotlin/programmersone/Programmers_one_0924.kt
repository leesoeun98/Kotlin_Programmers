package programmersone


class Programmer_one_0924 {

    // Kotlin에서 진법 변환은 toString()과 toInt()가 해줌
    // 시간 소요: 8ms
    fun reversed3(n: Int): Int = n.toString(3).reversed().toInt(3)

    // 프로그래머스 레벨 1 - 시저암호
    // 다른 사람 풀이 봄 (42분 소요, 문제 시간 14ms 정도)
    // string을 순회해서 처리하기 위해 toList().joinToString("") 사용
    // 이때 when과 in쓰기, 이 경우 it으로 element에 접근 가능
    // 규칙에도 주의 (알파벳 범위에서만 돌게 해야 함)
    fun caesarCipher(s: String, n: Int): String = s.toList().joinToString(""){
        when (it){
            in 'A'..'Z' -> if(it.code + n > 'Z'.code) (it.code + n - 26).toChar() else (it.code+n).toChar()
            in 'a'..'z' -> if(it.code + n > 'z'.code) (it.code + n - 26).toChar() else (it.code+n).toChar()
            else -> it
        }.toString()
    }
    // 프로그래머스 레벨 1 - 최소직사각형
    // 8분 소요 (문제 시간 8ms 정도)
    // 둘 중 큰거를 한쪽으로 다 몰아서 정렬 (가로가 더 큰 길이라고 가정)
    fun minSquare(sizes: Array<IntArray>): Int {
        val rowList = mutableListOf<Int>()
        val colList = mutableListOf<Int>()
        for(size in sizes){
            rowList.add(Math.max(size[0], size[1]))
            colList.add(Math.min(size[0], size[1]))
        }
        return rowList.maxOrNull()!! * colList.maxOrNull()!!
    }

    // 프로그래머스 레벨 1 - 문자열 내 마음대로 정렬하기
    // 다른 사람 풀이 봄 (8분 소요, 문제 시간 15ms 정도)
    // also를 쓰거나 sort와 동시에 반환하고 싶으면 sortedWith에 compareBy 사용하기 (반환하는게 중요! also도 반환함)
    fun sortString(strings: Array<String>, n: Int): Array<String> = strings.sortedWith(compareBy ({ it[n] }, {it})).toTypedArray()

    // 프로그래머스 레벨 1 - K번째수
    // 3분 소요 + 다른 사람 풀이 보고 수정 (문제 시간 24ms 정도)
    // array slice는 slice 확장 함수 쓰기 (range가 인자임)
    // map쓰기!!!
    fun kthNumber(array: IntArray, commands: Array<IntArray>): IntArray = commands.map{
        command ->
            array.slice(command[0]-1 until command[1]).sorted()[command[2]-1]
        }.toIntArray()

    // 프로그래머스 레벨 1 - 숫자 문자열과 영단어
    // 다른 사람 풀이 봄 (8분 소요, 문제 시간 12ms 정도)
    // mapOf쓰기랑 replace 쓰기에 주의
    // 너무 Kotlin스럽게 하려고 부담갖지 말고, 일반함수로 작성하고서 refactor하기!
    fun numberStringAndEnglishWord(s: String): Int {
        var answer = s
        val numberMap = mapOf("zero" to 0, "one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9)
        for((k, v) in numberMap){
            answer = answer.replace(k, v.toString())
        }
        return answer.toInt()
    }

    // 프로그래머스 레벨 1 - 두 개 뽑아서 더하기
    // 8분 소요 (문제 시간 25ms 정도)
    // combination을 쓰기 어려우니 그냥 이중 for문 쓰자
    fun pickTwoAndSum(numbers: IntArray): IntArray {
        var answer = mutableSetOf<Int>()
        for(i in numbers.indices){
            for(j in i+1 until numbers.size){
                answer.add(numbers[i] + numbers[j])
            }
        }
        return answer.toIntArray().sortedArray()
    }

    // 프로그래머스 레벨 1 - 2016년
    // 5분 소요 (문제 시간 25ms 정도)
    // 수학문제임!
    fun cal2016(a: Int, b: Int): String {
        val day = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        val month = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val diff = month.slice(0 until a-1).sum() + b - 1
        return day[diff%7]
    }

    // 프로그래머스 레벨 1 - 모의고사
    // 15분 소요 (문제 시간 20ms 정도)
    // Array 반복해서 만드는 법, mapIndexed와 filter 사용하기
    fun exam(answers: IntArray): IntArray {
        val first = Array(answers.size){idx -> arrayOf(1, 2, 3, 4, 5)[idx%5]}
        val second = Array(answers.size){idx -> arrayOf(2, 1, 2, 3, 2, 4, 2, 5)[idx%8]}
        val third = Array(answers.size){idx -> arrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)[idx%10]}
        val rightMap = mutableMapOf(1 to 0, 2 to 0, 3 to 0)
        answers.mapIndexed() { idx, elem ->
            if(elem==first[idx]) rightMap.put(1, rightMap[1]!! + 1)
            if(elem==second[idx]) rightMap.put(2, rightMap[2]!! + 1)
            if(elem==third[idx]) rightMap.put(3, rightMap[3]!! + 1)
        }
        return rightMap.filter { it.value == rightMap.values.maxOrNull() }.keys.sorted().toIntArray()
    }

    // 프로그래머스 레벨 1 - 소수 만들기
    // 15분 소요 (문제 시간 8ms 정도)
    // set을 쓸 필요가 없음에 주의! 소수가 되는 경우의 수를 구하는거임!
    fun makingPrime(nums: IntArray): Int {
        var answer = 0

        for(i in nums.indices){
            for(j in i+1 until nums.size){
                for(k in j+1 until nums.size){
                    if(!isNotPrime(nums[i] + nums[j] + nums[k])) answer +=1
                }
            }
        }
        return answer
    }
    fun isNotPrime(num: Int) = (2 until num).any { num % it == 0 }
}