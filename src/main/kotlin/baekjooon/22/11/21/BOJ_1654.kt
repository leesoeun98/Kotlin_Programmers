package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1654 {
    // 30분 소요, 반례 및 다른 사람 풀이 봄 (8회차 성공)
    // 1회차 실패 - n이 1인 경우 고려 안 함
    // 2회차 실패 - Long 고려 안 함
    // 3~7회차 실패 - 1 1 인 경우 예외처리 잘못 함
    val br = BufferedReader(InputStreamReader(System.`in`))
    val lines = mutableListOf<Long>()

    fun main(){
        val (k, n) = br.readLine()!!.split(' ').map{it.toInt()}

        for(i in 0 until k){
            lines.add(br.readLine().toLong())
        }
        var left = 1L
        var right = lines.maxOrNull()!!.toLong()
        var answer = 0L

        while(left<=right){
            var mid = (left+right)/2L
            // mid로 자른 count가 n보다 작으면 mid 줄이기, 아니면 mid 늘리기
            if(lines.sumOf { it/mid }<n) right = mid - 1
            else{
                left = mid + 1
                answer = mid
            }
        }
        println(answer)
    }
}