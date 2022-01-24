package com.company;
import java.util.ArrayList;
//Написать метод, который на входе получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
public class Main {
    public static void main(String[] args) {
    }
    ArrayList<String> Arr = new ArrayList<>();
    private static ArrayList<String> Array(ArrayList<String> Arr) {
        ArrayList<String> NewArray = new ArrayList<String>();
        NewArray.add(Arr.get(0));
        for (int i = 1; i < Arr.size(); i++) {
            if (NewArray.contains(Arr.get(i))){
                continue;
            } else{
                NewArray.add(Arr.get(i));
            }
        }
        return NewArray;
    }
}