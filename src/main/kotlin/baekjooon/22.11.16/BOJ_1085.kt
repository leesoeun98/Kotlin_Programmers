// 10분 소요, 혼자 풂 (허나 백준 Compile Error 계속 남)
// 의아한게..백준에서는 collections.min()은 안되고 minOrNull()만 됨;; => 컴파일에러땜에 6회차에 성공함
import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (x, y, w, h) = br.readLine()!!.split(' ').map{it.toInt()}
    println(listOf(x, w-x, h-y, y).minOrNull())
}