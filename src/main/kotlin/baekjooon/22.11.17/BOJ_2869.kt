// 8분 소요, 혼자 풂 (1회차 성공) - 시간초과 안나게 수식으로 풀기
import java.io.*
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (a, b, v) = br.readLine()!!.split(' ').map{it.toInt()}
    println(ceil((v-a).toDouble()/(a-b)).toInt()+1)
}