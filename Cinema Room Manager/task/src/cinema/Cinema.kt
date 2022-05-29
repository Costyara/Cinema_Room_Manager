package cinema

import java.util.Scanner
const val PRICE_BACK_ROWS = 8
const val PRICE_FRONT_ROWS = 10
const val SMALL_HALL = 60

fun main() {
    var action = true
    val scanner = Scanner(System.`in`)
    println("Enter the number of rows:")
    val numOfRow = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val numOfSeats = scanner.nextInt()
    val listOfSeats = initListOfSeats(numOfRow, numOfSeats)
    var buyTickets = 0
    //var percentage = numOfRow.toDouble() * numOfSeats.toDouble() / 100.0 * buyTickets.toDouble()
    //val formatPercentage = "%.2f".format(percentage)
    var currentIncome  = 0
    val totalIncome = totalIncome(numOfRow, numOfSeats)


    while (action) {
        println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit")
        when (readln().toInt()) {
            1 -> printTableOfSeats(listOfSeats)
            2 -> {
                while (true) {
                    println("\nEnter a row number:")
                    val selectRow = scanner.nextInt()
                    println("Enter a seat number in that row:")
                    val selectSeat = scanner.nextInt()

                    if (selectRow > listOfSeats.size || selectSeat > listOfSeats.size) {
                        println("\nWrong input!\n")
                    } else if (listOfSeats[selectRow - 1][selectSeat - 1] == "B") {
                        println("\nThat ticket has already been purchased!\n")
                    } else {
                        val price = priceTicket(numOfRow, numOfSeats, selectRow)
                        println("\nTicket price: $$price\n")
                        listOfSeats[selectRow - 1][selectSeat - 1] = "B"
                        buyTickets++
                        currentIncome += price
                        break
                    }
                }
            }
            3 -> {
                val percentage = buyTickets.toDouble() / (numOfRow.toDouble() * numOfSeats.toDouble()) * 100.0
                val formatPercentage = "%.2f".format(percentage)
                println("\nNumber of purchased tickets: $buyTickets\n" +
                        "Percentage: $formatPercentage%\n" +
                        "Current income: $$currentIncome\n" +
                        "Total income: $$totalIncome\n")
            }
            0 -> {
                println("Exit")
                action = false
            }
        }
    }

}

fun priceTicket(numOfRow: Int, numOfSeats: Int, selectRow: Int): Int {
    return if (numOfRow * numOfSeats < SMALL_HALL || selectRow <= numOfRow / 2) {
        PRICE_FRONT_ROWS
    } else {
        PRICE_BACK_ROWS
    }
}

fun initListOfSeats(row: Int, seats: Int) : MutableList <MutableList <String>>{
    val listOfSeats: MutableList <MutableList <String>> = mutableListOf()
    for (row in 0 until row) {
        val list = MutableList(seats){"S"}
        listOfSeats.add(list)
    }
    return listOfSeats
}

fun printTableOfSeats(table: MutableList <MutableList <String>>) {
    var numOfRow = 1
    println("\nCinema:")
    for (numOfSeat in table.first().withIndex()) {
        print(" ${numOfSeat.index + 1}")
    }
    println("")
    for (row in table) {
        print(numOfRow)
        numOfRow++
        for (seat in row) {
            print(" $seat")
        }
        println("")
    }
    println("")
}

fun totalIncome(numOfRow: Int, numOfSeats: Int): Int {
    val bigHallDivision = numOfRow % 2
    val totalIncome = if (numOfRow * numOfSeats <= SMALL_HALL) {
        numOfRow * numOfSeats * PRICE_FRONT_ROWS
    } else {
        (numOfRow / 2) * numOfSeats * PRICE_FRONT_ROWS + (numOfRow / 2 + bigHallDivision) * numOfSeats * PRICE_BACK_ROWS
    }
    return totalIncome
}