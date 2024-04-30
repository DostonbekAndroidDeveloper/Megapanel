package com.dostonbek.m

import PreferenceAdapter
import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dostonbek.m.databinding.FragmentPreferencesBinding

class PreferencesFragment : Fragment() {
    private lateinit var binding: FragmentPreferencesBinding
    private lateinit var adapter: PreferenceAdapter
    private lateinit var dataList: ArrayList<PreferenceData>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentPreferencesBinding.inflate(layoutInflater, container, false)
        dataList = ArrayList()
        dataList.add(
            PreferenceData(
                getString(R.string.yuqori_sifat),
                getString(R.string.biz_xizmatlarimiz_sifatini_doim_kuzatib_boramiz),
                R.drawable.diamond
            )
        )
        dataList.add(
            PreferenceData(
                getString(R.string.qulay_paneli),
                getString(R.string.bizning_panelimiz_barcha_zamonaviy_texnalogiyalardan),
                R.drawable.panel
            )
        )
        dataList.add(
            PreferenceData(
                getString(R.string.eng_yaxshi_narxlar),
                getString(R.string.xizmatlarni_birinchi_qo_ldan_sotib_oling),
                R.drawable.cost
            )
        )
        adapter = PreferenceAdapter(dataList)
        binding.preferenceRecyclerview.adapter = adapter

        return binding.root


    }


}