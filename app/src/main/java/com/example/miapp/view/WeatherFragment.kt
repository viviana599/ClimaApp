package com.example.miapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.miapp.utils.FragmentComunicator
import com.example.miapp.databinding.FragmentFirstBinding
import com.example.miapp.viewmodel.WeatherViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class WeatherFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!
    private lateinit var comunicator: FragmentComunicator
    private val viewModel by viewModels<WeatherViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        comunicator = requireActivity() as FragmentComunicator
        binding.menuButton.setOnClickListener {
            comunicator.magnagelouder(isVisible = true)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}