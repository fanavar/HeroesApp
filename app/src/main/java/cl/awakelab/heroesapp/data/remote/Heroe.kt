package cl.awakelab.heroesapp.data.remote

data class Heroe(
    val id: Int,
    val name: String,
    val origin: String,
    val imageLink: String,
    val power: String,
    val creationYear: Int
)