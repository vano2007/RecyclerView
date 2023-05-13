package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<School_Items> items = new ArrayList<School_Items>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_school);

        // создадим адаптер и загрузим в него контейнер с данными
        ItemAdapter adapter = new ItemAdapter(this, items);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        items.add( new School_Items("Алгебра", "Решение систем уравнений, квадратных уравнений, дробей, квадратных корней ",
                R.drawable.algebra, "стр.14 №10,12,13,14"));
        items.add( new School_Items("Геометрия", "Теоремы о равенстве треугольников, вписанные и описанные окружности",
                R.drawable.geometry, "стр.23 №48,50,51,53; стр.30 № 87,88"));
        items.add( new School_Items("Физика", "Формулы ускорения и скорости, свободного падения, ток, сила тока и напряжение",
                R.drawable.physics, "стр.13 №22,23"));
        items.add( new School_Items("Химия", "Периодическая таблица Менделеева, галогены, протоны, электроны и нейтроны и их взаимосвязь",
                R.drawable.chemistry, "стр.33 №60,13"));
        items.add( new School_Items("Литература", "Война и мир, Горе от ума, Вишневый сад, Мцыри, Мастер и маргарита, Преступление и наказание",
                R.drawable.literature, "Прочитать книги"));
    }
}