class Money(var Category: String, var Date: String, var Summ: Int) {
    fun info() {
        println("Category: $Category, Date: $Date, Value: $Summ")
    }
}

class Moneys() {
    var all_moneys: MutableList<Money> = arrayListOf()
    var categories: MutableSet<String> = mutableSetOf()

    fun add_money(money: Money) {
        all_moneys.add(money)
        categories.add(money.Category)
    }

    fun show_all() {
        for (it in all_moneys)
            it.info()
    }

    fun show_categories_sum() {
        var summ = 0
        for (it in categories) {
            for (it2 in all_moneys)
                if (it2.Category.equals(it)) {
                    summ += it2.Summ
                }
            println("$it summary is $summ")
            summ = 0
        }
    }
}

fun main() {
    val moneys = Moneys()
    val money = Money("Study", "20, January", 3000)
    val money3 = Money("Study", "2, May", 10000)
    val money2 = Money("Shop", "12, July", 68000)
    moneys.add_money(money)
    moneys.add_money(money2)
    moneys.add_money(money3)
    moneys.show_all()
    moneys.show_categories_sum()
}