fun main(args : Array<String>) {
    val cl = Employee(fgs = "df", se = "df")
    println(cl.se)
}

class Employee (var fgs : String) {
    lateinit var se : String
    constructor(se : String, fgs: String) : this(fgs) {
    this.se = se
    }

    fun test(){

    }

}