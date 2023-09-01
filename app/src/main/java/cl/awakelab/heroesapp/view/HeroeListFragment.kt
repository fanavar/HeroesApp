package cl.awakelab.heroesapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import cl.awakelab.heroesapp.R
import cl.awakelab.heroesapp.databinding.FragmentHeroeListBinding

class HeroeListFragment : Fragment() {
   lateinit var binding: FragmentHeroeListBinding
   private val heroeViewModel: HeroeViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHeroeListBinding.inflate(layoutInflater, container, false)
        //initAdapter()
        heroeViewModel.getHeroes()
        return binding.root
    }

    /*private fun initAdapter() {
        val adapter = HeroesAdapter()

        binding.rvPhonesList.adapter = adapter
        heroeViewModel.heroeLiveData().observe(viewLifecycleOwner) {
            adapter.setData(it)
        }
    }
*/
}