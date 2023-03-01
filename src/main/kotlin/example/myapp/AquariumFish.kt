package example.myapp
interface FishColor {
    val color: String
}
class Shark (fishColor: FishColor = GrayColor): FishAction by PrintingFishAction("hunt and eat fish"), FishColor by fishColor

class Plecostomus (fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("eat algae"), FishColor by fishColor
interface FishAction {
    fun eat()
}
object GoldColor : FishColor {
    override val color = "gold"
}
object GrayColor: FishColor {
    override val color = "gray"
}
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}