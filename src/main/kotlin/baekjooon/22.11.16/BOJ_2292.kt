// 12분 소요, 혼자 풂 (1회차 성공)

import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()
    // 몇 번째 line인지 계산하기 (1, 6, 12, 18, 24) == 6*(1+2+3+4)+1 == 6*(i*(i+1)/2)+1
    if(n==1){
        println(1)
        return
    }
    for(i in 1 until n+1){
        if(6*(i*(i-1)/2)+1<n && n<=6*(i*(i+1)/2)+1){
            println(i+1)
            break
        }
    }

}