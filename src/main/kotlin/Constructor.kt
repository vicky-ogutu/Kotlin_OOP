class Constructor (var model:String, var price:Int){
    fun drive(){
        println("no noise")
    }

    fun driver(name:String){
        print(name)
    }
}

fun main(){
    var obj1 =Constructor("Subaru", 1300000)
    println(obj1.model + " " + obj1.price)
    obj1.drive()
    obj1.driver("Omwami")
}