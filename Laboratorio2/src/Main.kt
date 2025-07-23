/*
* Universidad del Valle de Guatemala
* Programación de plataformas móviles
* Sección: 20
* Autora: Tiffany Salazar Suarez
* Carnet: 24630
*/
fun main() {
    //Función de calcular promedio
    fun calcularPromedio(listNum: List<Int>): String{
        val sum = listNum.reduce {acc, element -> acc + element}
        return "El promedio de la lista es: ${sum/listNum.size}"
    }

    //Lista de números impares
    val listNumEnt: List<Int> = listOf(1,2,3,4,5)
    val listNumImp = listNumEnt.filter{it % 2 != 0}

    //Función isPallidrome
    fun isPallidrome(cad: String): Boolean = cad.reversed() == cad

    //Saludo antes de nombre con map
    val nombres: List<String> = listOf("Maria", "Ana", "Mario", "José", "Luis", "Julia")
    val nombresSaludo = nombres.map{("\n¡Hola, $it!")}

    //Función performOperation
    fun performOperation(num1: Int, num2: Int): Int{
        val suma = {num1: Int, num2: Int -> num1 + num2}
        return suma(num1, num2)
    }

    //Función de mapeo con Student y Person
    fun perStudMap(person: Person, studentId: String): String {
        val personas: MutableList<Person> = mutableListOf()
        val nuevStud = personas.map {persona -> Student(person.name, person.age, person.gender, studentId)}
        val listStud = nuevStud.map {nuevStud -> "El Estudiante ${nuevStud.name} tiene ${nuevStud.age}"}
        return listStud.joinToString("\n")
    }
}
