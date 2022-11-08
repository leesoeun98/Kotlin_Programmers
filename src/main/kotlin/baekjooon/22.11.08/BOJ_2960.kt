// 20분 소요, 혼자 풂 (문제 잘 읽기! 소수도 지우는거고, 한번이라도 지운 수는 제외하고 지우는 거임 ㅠ)

import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
fun main(){

    var count = 0
    val (n, k) = br.readLine()!!.split(" ").map{it.toInt()}
    val primeList = MutableList(n+1){true}

    for(i in 2 until n+1){
        if(primeList[i]){
            for(j in i until n+1 step i){
                if(primeList[j]){
                    primeList[j]=false
                    count += 1
                    if(count==k) {
                        println(j)
                        return
                    }
                }
            }
        }
    }
}