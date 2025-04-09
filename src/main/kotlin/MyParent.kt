open class MyParent {
    var color = "dark_Skin"
}

class me : MyParent(){

    fun mycolor(){
        println(color)
    }
}

fun main(){
    var obj1 =me()
    obj1.mycolor()
}