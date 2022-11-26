package baekjooon.`22`.`11`.`26`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_1541 {
    // 1시간 20분 소요, 다른 사람 로직 봄 (3회차 성공)
    // 1회차 실패 - 로직이 틀림 (연산자가 없는 경우 예외처리 안함)
    // 2회차 실패 - 로직이 틀림 (+-+-번갈아 나오면? => +부터 다 해주고 - 해주면 됨)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        val sentence = br.readLine()
        val numList = sentence.split('+','-').map{it.toInt()}.toMutableList()
        val operationList = sentence.filter { it=='-' || it=='+' }.toMutableList()

        // + 부터 다 계산, - 나머지 계산
        while(operationList.filter { it=='+' }.count()!=0){
            val i = operationList.indexOf('+')
            val tempNum = numList[i]+numList[i+1]
            numList.removeAt(i)
            numList.removeAt(i)
            numList.add(i, tempNum)
            operationList.removeAt(i)
        }
        while(operationList.filter { it=='-' }.count()!=0){
            val i = operationList.indexOf('-')
            val tempNum = numList[i]-numList[i+1]
            numList.removeAt(i)
            numList.removeAt(i)
            numList.add(i, tempNum)
            operationList.removeAt(i)
        }
        println(numList.last())
    }
}