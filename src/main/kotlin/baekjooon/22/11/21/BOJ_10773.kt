package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_10773 {
    // 4분 소요, 혼자 풂 (1회차 성공) - stack 쓰는 문제
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = mutableListOf<Int>()

    fun main(){
        for(i in 0 until br.readLine()!!.toInt()){
            val n = br.readLine()!!.toInt()
            if(n==0){
                answer.removeAt(answer.lastIndex)
            }
            else{
                answer.add(n)
            }
        }
        println(answer.sum())
    }
}