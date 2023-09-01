package cl.awakelab.heroesapp.data

import android.util.Log
import androidx.lifecycle.LiveData
import cl.awakelab.heroesapp.data.local.HeroeDao
import cl.awakelab.heroesapp.data.local.HeroeEntity
import cl.awakelab.heroesapp.data.remote.HeroeApi

class Repository(private val heroeApi: HeroeApi, private val heroeDao: HeroeDao) {
    fun getHeroeEntity(): LiveData<List<HeroeEntity>> = heroeDao.getHeroes()

    suspend fun getHeroes(){
        val response = heroeApi.getData()
        if(response.isSuccessful){
            val heroes = response.body()
            if(heroes != null){
                //val heroeEntities = heroes.map{it.toHeroeEntity()}
                //heroeDao.insertHeroe(heroeEntities)
            }else{
                Log.e("repository", response.errorBody().toString())
            }
        }
    }
}