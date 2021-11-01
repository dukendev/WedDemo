package com.ysanjeet535.weddemo_.data

object FakeRepository {

    fun getAlphaNumList() : List<AlphaNum> {
        val alphanums : MutableList<AlphaNum> = emptyList<AlphaNum>().toMutableList()
        var i = 1
        var j = 'A'

        while (i <= 26 || j<='Z'){
            alphanums.add(AlphaNum(j.toString(),i))
            i++
            j++
        }
        return alphanums
    }
}