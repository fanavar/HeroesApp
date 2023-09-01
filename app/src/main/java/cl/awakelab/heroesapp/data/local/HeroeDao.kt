package cl.awakelab.heroesapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface HeroeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHeroe(heroeEntity: List<HeroeEntity>)

    @Query("Select * from table_heroes order by id asc")
    fun getHeroes(): LiveData<List<HeroeEntity>>
}