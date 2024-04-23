package com.example.lr3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lr3.databinding.ActivityMainBinding

// главная активити
class MainActivity : AppCompatActivity() {
    // инициализируем биндинг при первом запросе
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // задаем содержание активити
        setContentView(binding.root)

        // задаем положение отрисовываемых объектов
        binding.root.layoutManager = LinearLayoutManager(this)
        // задаем адаптер
        binding.root.adapter = PuppyAdapter {
            // переход на следующую активити
            val intent = Intent(this, Activity2::class.java)
            // передача в extra текущего щенка
            intent.putExtra("extra", it)
            startActivity(intent)
        }
    }
}