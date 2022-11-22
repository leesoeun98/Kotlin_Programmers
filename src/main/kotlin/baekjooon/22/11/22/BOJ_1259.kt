package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1259 {
    // 2분 소요, 혼자 풂 (1회차 성공) : reversed 쓰기
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        while(true){
            val question = br.readLine()
            if(question=="0") break
            if(question==question.reversed()) println("yes") else println("no")
        }
    }
}