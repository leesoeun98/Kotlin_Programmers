// 20분 소요, 유클리드 호제법 보고 풂
// 1차 실패: 재귀함수 return안줘서 compile error
// 2차 실패: 0으로 나누는 exception
// 3차 실패: 재귀에서 메모리 초과
// 4차 실패: 알고리즘 잘못이해해서 파라미터 오타

import java.io.*
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val (n,m) = br.readLine()!!.split(' ').map{it.toInt()}
    val g = gcd(max(n,m),min(n,m))
    println(g)
    println(n*m/g)
}

tailrec fun gcd(a: Int, b:Int): Int = if(b==0) a else gcd(b, a%b)
