// 17분 소요, 예전 코드 참고 함 (1회차 성공)
import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))

fun main(){
    val n = br.readLine()!!.toInt()
    var count=0
    var num=665

    while(true){
        num+=1
        if(num.toString().contains("666")) {
            count += 1
        }
        if(count==n){
            println(num)
            return
        }
    }
}