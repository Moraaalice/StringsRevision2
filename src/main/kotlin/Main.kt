fun main() {
    details("Alice",23)
    places("   Nakuru   ")
    towns("pipeline")
    countries("Kenya","Uganda")

}
fun details(name:String,age:Int){
    var statement = "my name is $name and am $age years old"
    println(statement)
    //string indexing
    println(name[1])
    println(name[0])
    println(name[2])
    //string case
    println(name.uppercase())
    println(name.lowercase())
    println(name.decapitalize())
    println(name.capitalize())
}
fun places(place1:String){
    var city = place1
    println(city)
    //trimming white spaces
    println(city.trimStart())
    println(city.trimEnd())
    println(city.trim())
}
fun towns(location:String){
    var location2 = location
    print(location2)
    //starts with
    println(location2.startsWith("p"))
    println(location2.replaceFirst("p","s"))
}
