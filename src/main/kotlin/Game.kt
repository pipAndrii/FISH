class Game {
    var path:MutableList<Directions> = mutableListOf(Directions.START)

    var north = {path.add(Directions.North)}
    var south = {path.add(Directions.South)}
    var west = {path.add(Directions.West)}
    var east = {path.add(Directions.East)}
    var end = {path.add(Directions.END)
                println("Game over \n $path")
                path.clear()

    }
}