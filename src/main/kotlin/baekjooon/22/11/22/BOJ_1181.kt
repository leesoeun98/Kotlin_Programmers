package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_1181 {
    // 3분 소요, 혼자 풂 (1회차 성공) : compareBy multiple은 ,로
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val words = mutableListOf<String>()

    fun main(){
        for(i in 0 until br.readLine().toInt()){
            val q = br.readLine()
            if(!words.contains(q)) words.add(q)
        }
        words.sortWith(compareBy ({ it.length },{it}))
        words.map{bw.write(it+"\n")}
        bw.flush()
        bw.close()
    }
}