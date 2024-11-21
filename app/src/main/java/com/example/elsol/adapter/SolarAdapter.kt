import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.elsol.R
import com.example.elsol.adapter.SolarViewHolder
import com.example.elsol.model.Solar

class SolarAdapter(private val solarList: List<Solar>) :
    RecyclerView.Adapter<SolarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SolarViewHolder(layoutInflater.inflate(R.layout.item_solar, parent, false))
    }

    override fun onBindViewHolder(holder: SolarViewHolder, position: Int) {
        val item = solarList[position]
        holder.render(item)

        // Configurar menú en la Toolbar
        holder.toolbar.inflateMenu(R.menu.options_menu)
    }

    override fun getItemCount(): Int = solarList.size
}
