package baekjooon.`22`.`11`.`23`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_11659 {
    // 12분 소요, 혼자 풂 (1회차 성공)
    // 누적합 쓰기! i부터 j까지의 합은 곧 처음부터 j까지 합 - 처음부터 i까지 합 + i번째 숫자
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
        val numList = br.readLine().split(' ').map{it.toInt()}.toList()

        val sumList = mutableListOf<Int>()
        sumList.add(numList[0])
        for(i in 1 until numList.size){
            sumList.add(sumList[i-1]+numList[i])
        }

        for(i in 0 until m){
            val (start, end) = br.readLine().split(' ').map{it.toInt()}
            bw.write("${sumList[end-1]-sumList[start-1]+numList[start-1]}\n")
        }
        bw.flush()
        bw.close()
    }
}