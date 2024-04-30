package com.dostonbek.m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dostonbek.m.databinding.FragmentServiceBinding

class ServiceFragment : Fragment() {
    private lateinit var binding: FragmentServiceBinding
    private lateinit var adapter: Adapter
    private lateinit var dataList: ArrayList<Data>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        binding = FragmentServiceBinding.inflate(layoutInflater, container, false)
        dataList = ArrayList()
        dataList.add(
            Data(
                R.drawable.g,
                getString(R.string.obunachilar),
                getString(R.string.kanal_va_guruhlarga_yordam_obunachi_qo_shish)
            )
        )
        dataList.add(
            Data(
                R.drawable.v,
                getString(R.string.ko_rishlar),
                getString(R.string.postlarni_ko_rishlar_sonini_ko_paytirish)
            )
        )
        dataList.add(
            Data(
                R.drawable.like,
                getString(R.string.reaksiyalar),
                getString(R.string.postlarga_turli_reaksiyalar_qo_yish)
            )
        )
        adapter = Adapter(dataList)
        binding.recyclerview.adapter = adapter



        return binding.root


    }


}