import java.lang.Exception

fun main() {
//println("Hello World")
//    var x: Int = 3
//    println("the value of x is: $x")
//    x = 5
//    println("the value of x is now: $x")

//    numbers and variable declaration
//    val x = 20
//    val wholeNumber = 3
//    val bigNumber = 3L
//    val preciseDecimal = 3.33f
//    val iLoveVegetables = false
//    val iLovePizza = true
//    val iAmALetter = 'a'
//    print("the value of the variable x is $x")

//    arithmetic operators
//    val x = 3 + 4
//    val floatNumbers = 5f / 6f
//    println("the value of x is $x")
//    println("the value of x is $floatNumbers")
////    boolean
//    val amIAnAdult = true
//    val amIAProgrammer = true
//    val amIAnAdultProgrammer = amIAnAdult && amIAProgrammer
//    print("Am I an adult programmer is: $amIAnAdultProgrammer")

//    strings
//    val strings = "I am loving this language"
//    println(strings)
//    println(strings.toUpperCase())

//    conditions
//    val x = 1 + 3
//    if (x == 2){
//        println("x is 2")
//    } else if(x == 3){
//        println("x is 3")
//    } else {
//        println("this is just as awesome as it gets")
//    }
//    val y = if(x == 2)2 else 3

//    null pointer exception
//    type is not nullable by default. Either it is or it is not
//    val x: Int? = null
//    accepting user input
//    val number1 = readLine() ?: "0"
//    val number2 = readLine() ?: "0"
//    val result =  number1.toInt() + number2.toInt()
//    println(result)

////    list: data containers we can use to store a bunch of variables. Mutable and unmutable
//    val shoppingList = listOf<String>("Lamborghini", "Penthouse", "Rolex")
//    println(shoppingList[2])
////    mutable list: we can add and remove items from the list
//    val shoppingList2 = mutableListOf("Spider", "Hussle", "Seth", "Magic fingers")
//    shoppingList2.add("Swagger")
//    println(shoppingList2[4])

//    loops: Execute a specific action several times. while loop and for loop.
//    val shoppingList2 = mutableListOf("Spider", "Hussle", "Seth", "Magic fingers")

////while loop
//    var counter = 0
//    while (counter < shoppingList2.size){
//        println(shoppingList2[counter])
//        counter++
//    }
////    for loops
//    for(shoppingItem in shoppingList2){
//        println(shoppingItem)
//    }
////    looping over a particular range
//    for(i in 1..100){
//        println(i)
//    }
////    when expression
//    val x = 3
//    when(x){
//       in 1..2 -> println("x is between 1 and 2")
//        in 3..10 -> println("x is between 3 and 10")
//        else ->{
//            println("x is not in the range of 1 - 10")
//        }
//    }

    //functions
//    print10Numbers()
//    val x = isEven(number = 5)
//    println(x)
//    val y = 3
//    println(y.isOdd())


////    classes
//    val dog = Dog()
//    dog.bark()
//
//    val cat = Cat()
//    cat.meow()
//
////    exceptions, try catch
//    val number = readLine() ?: "0"
//    val parsedNumber = try{
//        number.toInt()
//    }catch (e: Exception){
//        0
//    }
//    println(parsedNumber)


//    lambda functions
    val list = listOf("kotlin", "is", "fun")
    val count = list.count{currentString ->
        currentString.length == 3
    }
    println(count)
}

fun List<String>.customCount(function: (String)-> Boolean): Int {
    var counter = 0
    for(string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}
//function
fun Int.isOdd(): Boolean{
    return this % 2 === 1
}


fun isEven(number: Int): Boolean{
    return number % 2 == 0
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}