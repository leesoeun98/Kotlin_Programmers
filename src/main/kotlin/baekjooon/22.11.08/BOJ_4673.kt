// 45분 소요 - 로직 자체는 혼자 생각했으나, 각 자릿수를 더하는 과정에서 reduce를 써버림
// (그냥 sum 쓰면되는데.. 거기다가 int를 toString()으로 바꾸면 charArray가 되어서 아스키 코드이기 때문에 '0'도 빼야함)

fun main(){

    val numberList = MutableList<Boolean>(10001){false}

    for(i in 1 until 10001){
        val num = i.toString().map{it.code - '0'.code}.sum() + i
        if(num<10001){
            numberList[num]=true
        }
    }

    for(i in 1 until 10001){
        if(!numberList[i]){
            println(i)
        }
    }
}