fun main() {
    var names=nameList(listOf("jane","victorine","sarah","joy","catherine","wato","james","papai","mercy","harriet"))
     println(names)
    println(peopleHeight(listOf(1.2,1.3,1.1,1.0)))
    var person= listOf(
        Person("Evans",24,1.5,55.2),
        Person("Agnes",21,1.4,66.4),
        Person("Velma",33,1.2,76.3),
    )
    var sortedPerson=person.sortedByDescending { person ->person.age  }
    println(sortedPerson)

    info()
    println(car(listOf(180,120,130)))

}
fun nameList(names:List<String>):List<String> {
    var b = mutableListOf<String>()
    for (name in names) {
        if (names.indexOf(name) % 2 == 0) {
            b.add(name)
        }

    }
        return b
    }
data class People(var average:Double,var total:Double)
    fun peopleHeight(height:List<Double>):People{
       var average=height.average()
        var total=height.sum()
    var person=People(average,total)
        return person

    }
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)

fun info() {
    var person = mutableListOf(
        Person("Evans", 24, 1.5, 55.2),
        Person("Agnes", 21, 1.4, 66.4),
        Person("Velma", 33, 1.2, 76.3),

        )
    person.addAll(listOf(
        Person("Jeyson",22,1.1,70.3),
        Person("Ivy",45,2.0,66.4),
    ))
    println(person)
}
data class Car( var registration:String, var mileage:Int)

    fun car(mileage: List<Int>): Int {
        var totalMileage= mileage.average().toInt()
        return totalMileage



    }



