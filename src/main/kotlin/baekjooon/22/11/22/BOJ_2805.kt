package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_2805 {
    // 11분 소요, 혼자 풂 (1회차 성공) - 이분 탐색
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
        val trees = br.readLine().split(' ').map{it.toLong()}.toList()

        var left = 0L
        var right = trees.maxOrNull()!!+1L
        var answer = 0L

        while(left<=right){
            var mid = (left+right)/2L
            // mid 높이로 자를 때 얻는 나무가 m보다 많으면 mid 높이기 아니면 낮추기
            if(trees.filter { it>mid }.map { it-mid }.sum() >= m){
                left = mid + 1L
                answer = mid
            }
            else{
                right = mid - 1L
            }
        }
        println(answer)
    }
}