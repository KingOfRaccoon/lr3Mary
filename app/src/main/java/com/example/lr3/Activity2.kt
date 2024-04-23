package com.example.lr3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lr3.databinding.Activity2Binding

// активити для описания щенка
class Activity2 : AppCompatActivity() {
    // инициализируем биндинг при первом запросе
    private val binding: Activity2Binding by lazy { Activity2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // задаем содержание активити
        setContentView(binding.root)

        // получаем данные из предыдущей активити
        val puppy = intent.getSerializableExtra("extra") as? Puppy
        if (puppy != null) { // проверка на null
            // присваеваем данные в поля
            binding.textName.text = puppy.name
            binding.textDesc.text = puppy.desc
            binding.image.setImageResource(puppy.image)
        }
    }
}