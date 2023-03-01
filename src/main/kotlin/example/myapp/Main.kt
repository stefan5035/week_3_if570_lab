package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.height = 60
    myAquarium.printSize()
}
fun main() {
    buildAquarium()
}