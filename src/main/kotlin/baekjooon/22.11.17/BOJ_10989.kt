// 20분 소요, 혼자 풂 (3회차에 성공)
// 1회차 실패: 메모리 초과 => 범위가 10000보다 작은 수임을 이용하자
// 2회차 실패: 시간 초과 => println을 BufferedWriter로 바꾸기
import java.io.*
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))
val numMap = (1..10000).associateWithTo(mutableMapOf()){0}

fun main(){
    val n = br.readLine()!!.toInt()
    for(i in 0 until n){
        val nn = br.readLine()!!.toInt()
        numMap[nn] = numMap[nn]!! + 1
    }
    for(i in 1..10000){
        if(numMap[i]!=0){
            for(j in 1..numMap[i]!!) {
                bw.write(i.toString()+"\n")
            }
        }
    }
    bw.flush()
    bw.close()
}