package com.stepashka.kotlinranks

import java.util.*
import kotlin.math.min

class SortPlayerScores
class Player(var name: String, var score: Int)
class Checker : Comparator<Player?> {
    // complete this method
    override fun compare(a: Player?, b: Player?): Int {
        if (a!!.score < b!!.score) return 1
        if (a.score > b.score) return -1
        if (a.score == b.score) {
            val min = min(a.name.length, b.name.length)
            var i: Int = 0
            while (i < min && a.name[i] == b.name[i]) {
                i++
            }
            if (i >= min) {
                if (i >= a.name.length) return -1
                if (i >= b.name.length) return 1
            }
            if (a.name[i] < b.name[i]) return -1
            if (a.name[i] == b.name[i]) return 0
            if (a.name[i] > b.name[i]) return 1
        }
        return -1
    }
}

fun main(args: Array<String>) {
            val scan = Scanner(System.`in`)
            val n = 5
            val player =  arrayOf<Player>(
                Player("amy", 100),
                Player("david", 100),
                Player("heraldo" ,50),
                Player("aakansh", 75),
                Player("aleksa ",150))
            val checker = Checker()
            for (i in 0 until n) {
                player[i] = Player(scan.next(), scan.nextInt())
            }
            scan.close()
            Arrays.sort(player, checker)
            for (i in player.indices) {
                System.out.printf("%s %s\n", player[i]!!.name, player[i]!!.score)
            }

}
val myPlayerList = arrayOf<Player>(
        Player("amy", 100),
        Player("david", 100),
        Player("heraldo" ,50),
        Player("aakansh", 75),
        Player("aleksa ",150))