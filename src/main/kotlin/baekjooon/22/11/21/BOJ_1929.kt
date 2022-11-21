package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class BOJ_1929 {
    // 5분 소요, 혼자 풂 (1회차 성공) - 에라토스테네스의 체 + bw
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        val (m, n) = br.readLine()!!.split(' ').map{it.toInt()}
        val isPrime = MutableList(n+1){true}
        isPrime[0] = false
        isPrime[1] = false

        for(i in 2 until n+1){
            if(isPrime[i]){
                for(j in 2*i until n+1 step i){
                    isPrime[j]=false
                }
            }
        }
        for(i in m until n+1){
            if(isPrime[i]) bw.write(i.toString() + "\n")
        }
        bw.flush()
        bw.close()
    }
}