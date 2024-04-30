package com.dostonbek.m

import android.app.AlertDialog
import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dostonbek.m.databinding.FragmentHomefragmentBinding
import java.util.Locale

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomefragmentBinding
    private lateinit var drawerLayout: DrawerLayout
    private val languages = arrayOf("Uzbek", "English", "Russian", "German", "Korean", "French")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomefragmentBinding.inflate(layoutInflater, container, false)
        binding.language.setOnClickListener {

            showLanguageDialog()
        }



        return binding.root


    }

    private fun showLanguageDialog() {
        val builder = AlertDialog.Builder(requireContext())

        builder.setTitle("Select Language")
            .setItems(languages) { _, which ->
                changeLanguage(languages[which])


            }

            .show()
            .setCanceledOnTouchOutside(false)


    }

    private fun changeLanguage(selectedLanguage: String) {
        val locale = when (selectedLanguage) {
            "Uzbek" -> Locale("uz")
            "English" -> Locale("en")
            "Russian" -> Locale("ru")
            "German" -> Locale("gem")
            "Korean" -> Locale("ko")
            "French" -> Locale("fr")
            else -> Locale.getDefault()
        }
        val configuration = Configuration(resources.configuration)
        configuration.setLocale(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        requireActivity().recreate()

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.addLayout.setOnClickListener {
            val openAdd = Intent(android.content.Intent.ACTION_VIEW)
            openAdd.data = Uri.parse("https://megapanel.uz/reg")
            startActivity(openAdd)
        }
        binding.orderLayout.setOnClickListener {
            val openOrder = Intent(android.content.Intent.ACTION_VIEW)
            openOrder.data = Uri.parse("https://megapanel.uz/order/4618095/4824")
            startActivity(openOrder)
        }
        binding.avzalliklar.setOnClickListener {
            findNavController().navigate(R.id.preferencesFragment)
        }
        binding.xizmatlar.setOnClickListener {
            findNavController().navigate(R.id.serviceFragment)


        }


    }


}