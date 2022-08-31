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

}
