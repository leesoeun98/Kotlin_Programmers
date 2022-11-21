package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1018 {
    // 25분 소요, 혼자 풂 (1회차 성공) - 미리 만든 보드와 비교해서 count 증가하기 (브루트포스)
    val br = BufferedReader(InputStreamReader(System.`in`))
    val answer = mutableListOf<Int>()

    fun main(){
        val (n, m) = br.readLine()!!.split(' ').map{it.toInt()}
        val board = mutableListOf<String>()
        val compareBoard1 = mutableListOf<String>() // BW
        val compareBoard2 = mutableListOf<String>() // WB
        val temp1 = "BWBWBWBW"
        val temp2 = "WBWBWBWB"

        for(i in 0 until 8){
            if(i%2==0){
                compareBoard1.add(temp1)
                compareBoard2.add(temp2)
            }
            else{
                compareBoard1.add(temp2)
                compareBoard2.add(temp1)
            }
        }

        for(i in 0 until n){
            board.add(br.readLine())
        }

        for(i in 0 until n-7){
            for(j in 0 until m-7){
                var count1 = 0
                var count2 = 0
                for(col in 0 until 8){
                    for(row in 0 until 8){
                        if(board[col+i][row+j]!=compareBoard1[col][row]){
                            count1+=1
                        }
                        if(board[col+i][row+j]!=compareBoard2[col][row]){
                            count2+=1
                        }
                    }
                }
                answer.add(count1)
                answer.add(count2)
            }
        }
        println(answer.minOrNull())
    }
}