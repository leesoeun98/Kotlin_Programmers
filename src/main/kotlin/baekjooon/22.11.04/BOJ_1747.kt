// 총 45분 소요 - 문제 잘읽기!!! 크거나 같고임
// 새로 배운 내용 - String.reversed(), list value Initialize, 에라토스테네스 체

import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
var primeList = MutableList(1004001) { _ -> true }

fun main(){
    val n = br.readLine()!!.toInt()
    primeList[0]=false
    primeList[1]=false
    prime()

    for(i in n until 1004001){
        if(primeList[i] && isPendildrom(i)){
            println(i)
            break
        }
    }
}

// 팬딜드롬
fun isPendildrom(n: Int) = n.toString() == n.toString().reversed()

// 에라토스테네스의 체
fun prime(){
    for(i in 2 until 1004001){
        if(primeList[i]){
            for(j in 2*i until 1004001 step i){
                primeList[j]=false
            }
        }
    }
}
