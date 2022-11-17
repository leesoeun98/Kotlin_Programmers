// 10분 소요, 혼자 풂 (2회차 성공)
// 1회차 실패 - Comiple Error => Combination Library 대신 nested for loop 쓰기
import java.io.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (n,m) = br.readLine()!!.split(' ').map{it.toInt()}
    val cards = br.readLine()!!.split(' ').map{it.toInt()}.toList()
    val answer = mutableListOf<Int>()

    for(i in 0 until n){
        for(j in i+1 until n){
            for(k in j+1 until n){
                if(cards[i]+cards[j]+cards[k]<=m){
                    answer.add(cards[i]+cards[j]+cards[k])
                }
            }
        }
    }
    println(answer.maxOrNull())

}