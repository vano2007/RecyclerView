package com.example.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>{

    // поля адаптера
    private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
    private final List<School_Items> items; // поле коллекции контейнера для хранения данных (объектов класса School_Items)

    // конструктор адаптера
    public ItemAdapter(Context context, List<School_Items> items) {
        this.inflater = LayoutInflater.from(context);
        this.items = items;
    }

    // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту School_Item
    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder(view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту School_Item по определенной позиции
    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        School_Items item = items.get(position);
        holder.itemView.setImageResource(item.getItemResource());
        holder.nameView.setText(item.getName());
        holder.itemDescriptionView.setText(item.getItemDescription());
        holder.itemSizeView.setText(item.getItemSize());

    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return items.size();
    }

    // созданный статический класс ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // неизменяемые поля представления
        final ImageView itemView;
        final TextView nameView, itemDescriptionView, itemSizeView;

        // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
        ViewHolder(View view) {
            super(view);
            itemView = view.findViewById(R.id.itemResource);
            nameView = view.findViewById(R.id.name);
            itemDescriptionView = view.findViewById(R.id.itemDescription);
            itemSizeView = view.findViewById(R.id.itemSize);
        }
    }
}
