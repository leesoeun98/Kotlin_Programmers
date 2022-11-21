package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.round

class BOJ_2108 {
    // 52분 소요, 다른 사람 풀이 봄 (4회차 성공) - groupBy 꼭 쓰기 (특정 값의 개수로 그룹 지을 경우)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val numList = mutableListOf<Int>()

        for(i in 0 until br.readLine()!!.toInt()){
            numList.add(br.readLine().toInt())
        }

        numList.sort()

        println(round(numList.average()).toInt())

        println(numList[numList.size/2])

        val maxCount = numList.groupBy { it }.maxOf { it.value.size }
        val answer = numList.groupBy { it }.filter { it.value.size==maxCount }.toList().sortedBy { it.first }
        if(answer.count()>1) println("${answer[1].first}") else println("${answer[0].first}")

        println(abs(numList.last()-numList.first()))
    }
}