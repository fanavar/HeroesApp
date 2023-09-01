package cl.awakelab.heroesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*
App listado, detalle y correo de Super Heroes prueba de certificación
[x] Manifest: activar permisos de internet, android:usesCleartextTraffic="true" y android:enableOnBackInvokedCallback="true"
[x] Gradle: activar viewBinding | Plugin: kotlin-kapt | Dependencias: Coil, Room, RetroFit, navigation, viewModel | API mínima 27 y target 33 |
   pasar a version 17 en CompileOptions y KotlinOptions
[x] Se creó la estructura de paquetes: data(local y remote) y view(correspondiente a la presentación)
[] Data:
    [] Local:
         [x] DataBase
         [x] Entity
         [x] Dao (es una interface)
         [] DetalleEntity
    [] Remote:
         [x] DataClass
         [] Detalle DataClass
         [x] API (es una interface)
         [x] RetroFit
    [x]Repository
[] View
    [x]ListFragment
    [x]ViewModel
    []Adapter

[]Main Activity
[] 2 pantallas:
    [] Listado: RecyclerView + ViewHolder + Adapter
    [] Detalle: RecyclerView + ViewHolder + Adapter
[] Navigation

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}