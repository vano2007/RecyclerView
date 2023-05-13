package com.example.recyclerview;

public class School_Items {

    // поля сущности
    private String name; // поле названия предмета
    private String itemDescription; // поле описания предмета
    private int itemResource; // поле картинки предмета
    private String itemSize; // поле кол-во домашнего задания

    // конструктор
    public School_Items(String name, String itemDescription, int itemResource, String itemSize) {
        this.name = name;
        this.itemDescription = itemDescription;
        this.itemResource = itemResource;
        this.itemSize = itemSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemResource() {
        return itemResource;
    }

    public void setItemResource(int itemResource) {
        this.itemResource = itemResource;
    }

    public String getItemSize() {
        return itemSize;
    }

    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }
}
