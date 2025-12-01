package Lesson_2

const val PERCENT_BOOST_WITH_BUFF = 20
const val HUNDRED_PERCENT = 100

fun main() {
    val CrystalOre = 7
    val IronOre = 11
    val bonusCrystalOre = CrystalOre * PERCENT_BOOST_WITH_BUFF / HUNDRED_PERCENT
    val bonusIronOre = IronOre * PERCENT_BOOST_WITH_BUFF / HUNDRED_PERCENT
    println("$bonusCrystalOre crystal ore were additionally mined under the buff")
    println("$bonusIronOre iron ore were additionally mined under the buff")
}