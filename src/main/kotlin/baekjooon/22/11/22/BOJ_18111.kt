package baekjooon.`22`.`11`.`22`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_18111 {
    // 1시간 40분 소요, 다른 사람 풀이 봄 (9회차 성공)
    // 1~8회차 실패: 시간초과
    // (쓸데없는 코드 모두 지우기, fun으로 따로 빼서 호출, min max 라이브러리 말고 for문쓰기, minHeight랑 MaxHeight Tmrl)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val (n, m, b) = br.readLine()!!.split(' ').map{it.toInt()}
        val ground = mutableListOf<MutableList<Int>>()
        var maxHeight = Int.MIN_VALUE
        var minHeight = Int.MAX_VALUE

        for(i in 0 until n){
            val rowGround = mutableListOf<Int>()
            br.readLine()!!.split(' ').map{rowGround.add(it.toInt())}
            ground.add(rowGround)
        }

        ground.forEach{col->
            col.forEach{
                if(it<minHeight) minHeight = it
                if(it>maxHeight) maxHeight = it
            }
        }

        var answerTime = Int.MAX_VALUE
        var answerHeight = -1

        for(height in minHeight until maxHeight+1){
            val time = makeSame(ground, height, b)
            if(answerTime>=time){
                answerTime=time
                answerHeight = height
            }
        }
        println("$answerTime $answerHeight")
    }
    fun makeSame(ground: MutableList<MutableList<Int>>, height: Int, b: Int) : Int{
        var time = 0
        var inventory = b
        for(row in 0 until ground.size){
            for(col in 0 until ground[row].size){
                if(ground[row][col]>height){
                    val diff = ground[row][col]-height
                    time+=(2*diff)
                    inventory+=diff
                }
                else {
                    val diff = height - ground[row][col]
                    time+=diff
                    inventory-=diff
                }
            }
        }
        return if(inventory>=0) time else Int.MAX_VALUE
    }
}