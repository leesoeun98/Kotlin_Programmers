package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class BOJ_2164 {
    // 23분 소요, 혼자 풂 (2회차 성공)
    // 1회차 실패 - 자료구조의 중요성 (queue쓰자 그냥)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val n = br.readLine().toInt()
        val queue : Queue<Int> = LinkedList<Int>()

        for(i in 1 until n+1){
            queue.add(i)
        }
        while(queue.size>1){
            queue.poll()
            queue.add(queue.poll())
        }
        println(queue.element())
    }
}