fun main(){
    //implicit variable declaration
    //var name = "John"
    //the declaration above is similar to -> var name: String = "John"

    //Input - Process - Output
    println("Enter your name: ")
    var name: String = readln()
    println("Hello $name!!")

    //for Integer Input
    println("Enter an number:")
    var number: Int = readln().toInt()
    println("You have entered the number $number!")


}