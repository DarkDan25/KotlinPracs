class Money(var Category: String, var Date: String, var Summ: Int ){
    fun info(){
        println("Category: $Category, Date: $Date, Value: $Summ")
    }
}

fun main() {
    val Money = Money("Study", "20, January", 3000)
    Money.info()
}