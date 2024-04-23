package com.example.lr3

import androidx.annotation.DrawableRes
import java.io.Serializable

// класс для хранения данных о щенке
class Puppy(
    // картинка щенка
    @DrawableRes
    val image: Int,
    // имя щенка
    val name: String,
    // описание щенка
    val desc: String
): Serializable
// наследуемся от интерфейса,
// чтобы можно было передать объект класса в intent
