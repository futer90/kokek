package papik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 14.04.2017.
 */
public class ToDoList {
ArrayList<Item> items = new ArrayList<Item>();
 int count =1;
int  Add(String task){
        int id =count++;
        items.add(new Item(id,task));
        return id;


    }
    public void Delete(int id) {
        for (Item item : items
                ) {
            if (item.getId() == id) {
                items.remove(id);
            }
        }
    }
    List<Item> View(){
        return items;
    }
}

