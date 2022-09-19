package programmersone

import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

class Programmers_one_0919 {

    // int로 parse하되 Exception 안내는 toIntOrNull() 이용하기
    fun handlingString(s: String): Boolean = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

    // kotlin스럽게 fold 쓰기!!! 조건에 맞으면 - 아니면 + (시간도 3ms 정도)
    fun sumAndCountOfDivisor(left: Int, right: Int): Int = (left..right).fold(0) { total, it ->
        if (Math.sqrt(it.toDouble()).toLong() * Math.sqrt(it.toDouble())
                .toLong() == it.toLong()
        ) total - it else total + it
    }

    // nested array라 두 번 zip 해야 함!! (시간: 8ms 정도)
    fun sumOfMatrix(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
        arr1.zip(arr2) { first, second -> first.zip(second) { a, b -> a + b }.toIntArray() }.toTypedArray()

    // repeat쓰면 시간 약 200ms로 매우 오래걸림
    // 그냥 for문 쓰자.. 50ms 정도는 빨라진다.
    fun sqaureStar(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        (1..b).forEach { _ ->
            (1..a).forEach { _ -> print("*") }
            println()
        }
    }

    // 시간 약 10ms
    // type long에 주의, let사용해서 return 하기 (let은 실행 코드 결과를 반환)
    fun calculateLackMoney(price: Int, money: Int, count: Int): Long =
        (1..count).map { it.toLong() * price.toLong() }.sum().let{ if(money > it) 0 else it - money}
}