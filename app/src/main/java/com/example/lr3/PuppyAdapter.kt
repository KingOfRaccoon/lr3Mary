package com.example.lr3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lr3.databinding.ItemPuppyBinding

// адаптер для списка щенков
class PuppyAdapter(
    // переход на следующую активити
    val goToActivity2: (Puppy) -> Unit
): RecyclerView.Adapter<PuppyAdapter.PuppyViewHolder>() {

    // данные о щенках
    private val puppies = arrayOf(
        Puppy(R.drawable.image, "Пееесель", "Это самый милый песель"),
        Puppy(R.drawable.image_2, "Шобак", "Это самый милый собак"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuppyViewHolder {
        // создаем viewholder для отрисовки карточек
        return PuppyViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_puppy, parent, false))
    }

    override fun onBindViewHolder(holder: PuppyViewHolder, position: Int) {
        // отрисовываем карточку с нужными данными
        holder.bind(puppies[position])
    }

    override fun getItemCount(): Int {
        return puppies.size
    }

    // класс для ViewHolder, который содержит в себе карточку с информацией о щенке
    inner class PuppyViewHolder(view: View): RecyclerView.ViewHolder(view){
        // биндинг карточки
        private val binding = ItemPuppyBinding.bind(view)

        // присвоение данных
        fun bind(puppy: Puppy){
            // задаем картинку
            binding.image.setImageResource(puppy.image)
            // задаем имя
            binding.textName.text = puppy.name

            // обработка нажатия на карточку
            binding.root.setOnClickListener {
                // переход на следующее активити
                goToActivity2(puppy)
            }
        }
    }
}