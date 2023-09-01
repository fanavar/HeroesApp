package cl.awakelab.heroesapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_heroes")
data class HeroeEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val origin: String,
    val imageLink: String,
    val power: String,
    val creationYear: Int
)