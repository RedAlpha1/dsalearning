package pattern

class Pattern {
    fun pyramid(){
        val column = 5
        for (i in 1..column){
            for(space in 1..column-i){
                print(" ")
            }
            for(j in 1 until 2*i){
                print("*")
            }
            println()
        }
    }
    fun invertedPyramid(){
       val column  = 5
        for (i in column downTo 1) {
            for(j in 1 ..   column-i){  //  i = 5  j = 5
                    print(" ")
            }
            for(k in 1 until 2*i){  //  i = 5  j = 5
                print("*")
            }
            println()
        }
    }
    fun triangle(){
        println()
        println()
        val column = 4
        for (i in 0..column){
            for(j in 0..i){
                print("*")
            }
            println()
        }
        for (i in column-1 downTo 0){
            for(j in 0..i){
                print("*")
            }
            println()
        }
    }
    fun zeroOneTriangle(){
        println()
        println()
        val column = 4
        for (i in 0..column){
            for (j in 0..i){
                if(j%2==0){
                    print("1")
                }else{
                    print("0")
                }
            }
            println()
        }
    }
    fun straightAndInvertTriangle() {
        println()
        println()
        val column = 4
        for (i in 1..column) {
            for (j in 1..i) {
                print(j)
            }
            for (k in i * 2 until column * 2) {
                print(" ")
            }
            for (l in i downTo 1) {
                print(l)
            }
            println()
        }
    }
    fun valuesPrintInTriangle(){
        println()
        println()
        val column = 5
        var counter = 1
        for (i in 1..column){
            for (j in 1..i){
                print("${counter++} ")
            }
            println()
        }
    }

    fun alphabetsPatternOne(){
        println()
        println()
        val column = 4
        val alphabets = 65
        for (i in 0..column){
            for (j in 0..i){
                print((alphabets + j).toChar())
            }
            println()
        }
    }

    fun alphabetsPatternTwo(){
        println()
        println()
        val column = 4
        val alphabets = 65
        var count = 0
        for (i in 0..column) {
            count = 0
            for (j in i..column) {
                print((alphabets + count).toChar())
                count++
            }
            println()
        }
    }

    fun alphabetsPatternThree(){
        println()
        println()
        val column = 4
        val alphabets = 65
        for (i in 0..column){
            for (j in 0..i){
                print((alphabets + i).toChar())
            }
            println()
        }
    }

    fun alphabetsPyramids(){
        println()
        println()
        val column = 4
        val alphabets = 65
        for (i in 0..column){
            for (j in 0 until column-i){
                print(" ")
            }
            for (k in 0..i){
                print((alphabets+k).toChar() + " ")
            }
            println()
        }
    }

    fun reverseTriangle(){
        println()
        println()
        val column = 4
        val alphabets = 65
        var count = 0
        for (i in column downTo 0){
            count = i
            for (j in count..i){
                print((alphabets+j).toChar())
                count++
            }
            println()
        }
    }


}
