fun main() {
    val game = Game()

    // Perform some actions
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()

    // Print the current path
    println(game.path)
}