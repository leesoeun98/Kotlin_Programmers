package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.floor

class BOJ_1920 {
    // 20분 소요, 혼자 풂 (2회차 성공) - 굉장히 범위가 큰 list에서 find(탐색)를 해야 한다면 이분 탐색
    // 1회차 실패 - 시간초과 (bw쓰기)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    fun main(){
        // 범위 매우 큼 => 이럴때 탐색은 이분 탐색 쓰기
        val n = br.readLine()!!.toInt()
        val numList = br.readLine()!!.split(' ').map{it.toInt()}.sorted()
        val n2 = br.readLine()!!.toInt()
        val numList2 = br.readLine()!!.split(' ').map{it.toInt()}

        for(num in numList2){
            var left = 0
            var right = numList.size-1
            var mid = 0

            while(left in 0 until right && right<=numList.size-1){
                mid = floor((left+right).toDouble() /2).toInt()

                if(num <= numList[mid]){
                    right = mid
                }
                else{
                    left = mid + 1
                }
            }

            if(num in numList.slice(left..right)){
                bw.write("1" +"\n")
            }
            else{
                bw.write("0"+"\n")
            }
        }
        bw.flush()
        bw.close()
    }
}