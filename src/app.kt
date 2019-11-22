fun main() {
    var miOrdernador = Computer("i5", Mouse(), screen = Screen())

    println("${miOrdernador.cpu} tiene un raton ${miOrdernador.mouse.tipo} y una pantalla ${miOrdernador.screen.marca} " +
            "una velocidad de ${miOrdernador.cpu}")

}

