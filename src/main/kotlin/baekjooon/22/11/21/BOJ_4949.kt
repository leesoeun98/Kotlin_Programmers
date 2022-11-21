package baekjooon.`22`.`11`.`21`

import java.io.BufferedReader
import java.io.InputStreamReader

class BOJ_4949 {
    // 14분 소요, 혼자 풂 (2회차 성공)
    // 1회차 실패 - 틀림 (stack에서 pop할 수 없는, 틀린 경우도 if문 처리해주기)
    val br = BufferedReader(InputStreamReader(System.`in`))

    fun main(){
        while(true){
            val sentence = br.readLine()
            val stack = mutableListOf<String>()
            if(sentence==".") return
            for(letter in sentence){
                if(letter=='(' || letter=='['){
                    stack.add(letter.toString())
                }
                else if(letter==')' && stack.size>0 && stack.last()=="("){
                    stack.removeAt(stack.lastIndex)
                }
                else if(letter==']' && stack.size>0 && stack.last()=="["){
                    stack.removeAt(stack.lastIndex)
                }
                else if(letter==')' || letter==']'){
                    stack.add(letter.toString())
                }
            }
            if(stack.size==0) println("yes")
            else println("no")
        }
    }
}