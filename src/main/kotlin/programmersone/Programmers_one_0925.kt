package programmersone

import kotlin.math.abs

class Programmers_one_0925 {

    // 프로그래머스 레벨 1 - 실패율
    // 19분 소요 (믄제 시간은 최대 144ms 정도 걸림)
    // 문제 조건 잘 읽기 (sort 조건이 두 개임 - 실패율 내림차순, stage 번호 오름차순) => sortWith 쓰기
    fun failures(N: Int, stages: IntArray): IntArray {
        val failures = mutableMapOf<Int, Float>()
        var total = stages.size
        for(i in 1..N){
            failures[i] = stages.filter { it == i }.count().toFloat() / total.toFloat()
            total -= stages.filter { it == i }.count()
        }
        return failures.toList().sortedWith(compareBy ({ -it.second }, {it.first})).toMap().keys.toIntArray()
    }

    // 프로그래머스 레벨 1 - 로또의 최고 순위와 최저 순위
    // 15분 소요 (문제 시간은 14ms 정도)
    // 문제 잘 읽자..괄호 주의
    fun lottos(lottos: IntArray, win_nums: IntArray): IntArray {
        val possible = lottos.filter { win_nums.contains(it)}.count()
        val first = 7 - (possible + lottos.filter { it==0 }.count())
        val second = 7 - possible
        return intArrayOf(if (first < 6) first else 6, if (second < 6) second else 6 )
    }

    // 프로그래머스 레벨 1 - 체육복
    // 14분 소요 (문제 시간은 20ms 정도)
    // sort 꼭 하기
    fun gymSuit(n: Int, lost: IntArray, reserve: IntArray): Int {
        val realReserve = reserve.filter { !lost.contains(it) }.sorted()
        val realLost = lost.filter { !reserve.contains(it) }.sorted().toMutableList()

        for(l in realReserve){
            if(realLost.contains(l-1)) realLost.remove(l-1)
            else if(realLost.contains(l+1))realLost.remove(l+1)
        }

        return n-realLost.size
    }

    // 프로그래머스 레벨 1 - 키패드 누르기
    // 30분 걸림 (문제 시간 최대 5ms 정도)
    // 문제 로직을 천천히 생각 후 풀어야 하는 문제
    fun solution(numbers: IntArray, hand: String): String {
        val keyPad = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9), intArrayOf(-1, 0, -2))
        var answer = ""
        var curLeft = -1
        var curRight = -2
        for(num in numbers){
            when(num){
                1, 4, 7 -> {
                    answer+="L"
                    curLeft = num
                }
                3, 6, 9 -> {
                    answer+="R"
                    curRight = num
                }
                else -> {
                    val leftLocation = mutableListOf<Int>()
                    val rightLocation = mutableListOf<Int>()
                    val targetLocation = mutableListOf<Int>()

                    for(i in keyPad.indices){
                        for(j in keyPad[0].indices){
                            if(keyPad[i][j]==curLeft) {
                                leftLocation.add(i)
                                leftLocation.add(j)
                            }
                            if(keyPad[i][j]==curRight) {
                                rightLocation.add(i)
                                rightLocation.add(j)
                            }
                            if(keyPad[i][j]==num) {
                                targetLocation.add(i)
                                targetLocation.add(j)
                            }
                        }
                    }
                    val leftDiff = abs(leftLocation[0]-targetLocation[0]) + abs(leftLocation[1] - targetLocation[1])
                    val rightDiff = abs(rightLocation[0]-targetLocation[0]) + abs(rightLocation[1] - targetLocation[1])

                    if(leftDiff > rightDiff) {
                        answer+="R"
                        curRight = num
                    }
                    else if(leftDiff < rightDiff){
                        answer+="L"
                        curLeft = num
                    }
                    else {
                        if(hand=="right"){
                            answer+="R"
                            curRight = num
                        }
                        else{
                            answer+="L"
                            curLeft = num
                        }
                    }
                }
            }
        }
        return answer
    }





}