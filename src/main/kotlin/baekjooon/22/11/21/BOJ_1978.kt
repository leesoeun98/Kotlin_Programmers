package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1978 {
    // 9분 소요, 혼자 풂 (1회차 성공)
    val br = BufferedReader(InputStreamReader(System.`in`))

    //list 초기화하는 법 외워두기
    val isPrime = MutableList(1001) {true}

    fun main(){
        isPrime[0]=false
        isPrime[1]=false

        for(i in 2 until 1001){
            if(isPrime[i]){
                for(j in 2*i until 1001 step i){
                    isPrime[j]=false
                }
            }
        }

        val n = br.readLine()!!.toInt()
        val numList = br.readLine()!!.split(' ').map{it.toInt()}

        println(numList.filter { isPrime[it] }.count())
    }
}