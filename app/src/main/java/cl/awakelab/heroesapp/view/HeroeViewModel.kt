package cl.awakelab.heroesapp.view

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import cl.awakelab.heroesapp.data.Repository
import cl.awakelab.heroesapp.data.local.HeroeDatabase
import cl.awakelab.heroesapp.data.remote.HeroeRetrofit
import kotlinx.coroutines.launch

class HeroeViewModel(application: Application): AndroidViewModel(application) {
    private val repository: Repository
    fun heroeLiveData() = repository.getHeroeEntity()
    init{
        val api = HeroeRetrofit.getRetrofitHeroe()
        val heroeDatabase = HeroeDatabase.getDatabase(application).getHeroeDao()
        repository = Repository(api, heroeDatabase)
    }
    fun getHeroes() = viewModelScope.launch {
        repository.getHeroes()
    }
}