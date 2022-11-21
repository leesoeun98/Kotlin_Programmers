package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_2751 {
    // 7분 소요, 혼자 풂 (1회차 성공) -> 시간초과 날거 같으면 bw쓰기
    // BufferedWriter쓰면 flush 잊지 말기
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        val numList = mutableListOf<Int>()

        for(i in 0 until br.readLine()!!.toInt()){
            numList.add(br.readLine()!!.toInt())
        }
        numList.sort()
        for(n in numList){
            bw.write(n.toString()+"\n")
        }
        bw.flush()
        bw.close()
    }
}