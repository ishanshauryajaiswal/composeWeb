package com.shaurya.me.ds


/*
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

Example 2:

Input: digits = ""
Output: []

Example 3:

Input: digits = "2"
Output: ["a","b","c"]
*/
class Solution {

    val map = mapOf(
        Pair(1, listOf()),
        Pair(2, listOf('a', 'b', 'c')),
        Pair(3, listOf('d', 'e', 'f')),
        Pair(4, listOf('g', 'h', 'i')),
        Pair(5, listOf('j', 'k', 'l')),
        Pair(6, listOf('m', 'n', 'o')),
        Pair(7, listOf('p', 'q', 'r', 's')),
        Pair(8, listOf('t', 'u', 'v')),
        Pair(9, listOf('w', 'x', 'y', 'z')),
    )
    fun letterCombinations(digits: String): List<String> {
        digits.forEach { 
            
        }
        return listOf()
    }

    fun getChar(list: List<Char>, index: Int): Char?{
        if(index>=list.size)
            return null
        return list[index]
    }
}

/*
Input:
N = 4
arr[] = {7,2,6,5}
B = 16
Output:
(2 2 2 2 2 2 2 2)
(2 2 2 2 2 6)
(2 2 2 5 5)
(2 2 5 7)
(2 2 6 6)
(2 7 7)
(5 5 6)

val ansList: List<List<Int>> = mutableListOf()

rec(arr, targetSum, currentSum, index, list){
    if(index == arr.size || currentSum > targetSum)
        return
    if(currentSum == targetSum){
        ansList.add(list)
        return
    }
    val i = arr[index]
    list.add(i)
    rec(arr, targetSum, currentSum + i, index, list)
    list.remove(i)
    rec(arr, targetSum, currentSum, index+1, list)
}
 */



/*

val ansList: List<List<Int>> = mutableListOf()

rec(arr: Array<Int<, visited: Array<Boolean>, list){
if(list.size == arr.size){
    ansList.add(list)
    return
}
visited.forEachIndexed{ i ->
 if(visited[i].not()){
    list.add(arr[i])
    visited[i] = true
    rec(arr, visited, list)
    list.removeLastElement()
    visited[i] = false
    }
}

}


 */




/*
Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.




 */

fun IntArray.swap(i: Int, j: Int){
    this[i] = this[i]*this[j]
    this[j] = this[i]/this[j]
    this[i] = this[i]/this[j]
}