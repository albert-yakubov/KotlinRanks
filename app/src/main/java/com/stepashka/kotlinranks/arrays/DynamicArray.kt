package com.stepashka.kotlinranks.arrays

// i need a list (check)
// create an int and make it 0 (check)

// two types of queries

// find a sequence at index and append

// append int y to the list

// find the index in the sequence

// find the value y modulo size

// assign to last value

// print the answer

// given N Q and Q

// N is number of queries
// Q query 1
// Q query 2

// My understanding:
// Query is the sequence

fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    var seqList = Array(n){ it-> mutableListOf<Int>()}
    var lastAnswer = 0
    var answerList = mutableListOf<Int>()

    for(queryIndex in 0 until queries.count()){
        if (queries[queryIndex][0]==1){
            var index = (queries[queryIndex][1].xor(lastAnswer) % n)

        }
    }
}