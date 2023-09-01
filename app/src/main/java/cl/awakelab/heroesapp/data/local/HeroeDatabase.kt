package cl.awakelab.heroesapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [HeroeEntity::class], version = 1) // si da error debo poner ",exportSchema = false)" luego del 1
abstract class HeroeDatabase: RoomDatabase() {
    abstract fun getHeroeDao(): HeroeDao

    companion object {
        @Volatile
        private var INSTANCE: HeroeDatabase? = null

        fun getDatabase(context: Context): HeroeDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HeroeDatabase::class.java,

                    "heroe_database"
                ).fallbackToDestructiveMigration()
                    .build()

                INSTANCE = instance
                return instance
            }
        }
    }
}