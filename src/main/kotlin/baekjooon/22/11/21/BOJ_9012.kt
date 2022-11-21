package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_9012 {
    // 3분 소요, 혼자 풂 (1회차 성공)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        for(i in 0 until br.readLine()!!.toInt()){
            val stack = mutableListOf<Char>()
            for(letter in br.readLine()){
                if(letter=='('){
                    stack.add(letter)
                }
                else if(letter==')' && stack.size>0 && stack.last()=='('){
                    stack.removeAt(stack.lastIndex)
                }
                else{
                    stack.add(letter)
                }
            }
            if(stack.size==0) println("YES")
            else println("NO")
        }
    }
}