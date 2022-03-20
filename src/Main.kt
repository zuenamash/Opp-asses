fun main(){
    var students = Humans(name = "Zuenah", age = 20, weight = 57)
    println(students.weight)
    students.eat(45)
    println(students.weight)
    println(students.speak("Daddy"))
    students.birthday()

   var me =User(firstName = "Zuenah", lastName = "Macharia", phonenumber = 739477439, password = 2222)
    println(me.firstName)
    println(me.password)
}
class Humans(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int):Int{
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
        return weight
    }
fun speak(speech: String):String {
    return (speech)
}
fun birthday(){
    println(age+1)
}
}
data class  User (var firstName:String,var lastName:String,var phonenumber:Int,var password:Int)


