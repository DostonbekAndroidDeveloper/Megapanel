import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dostonbek.m.PreferenceData
import com.dostonbek.m.databinding.ItemPreferenceBinding

class PreferenceAdapter(val list: ArrayList<PreferenceData>) :
    RecyclerView.Adapter<PreferenceAdapter.Vh>() {
    inner class Vh(var binding: ItemPreferenceBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: PreferenceData) {
            binding.preferenceText.text = data.mainText
            binding.secondText.text = data.secondText
            binding.preferenceImage.setImageResource(data.image)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemPreferenceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }


}