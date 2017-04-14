package papik;

import javax.swing.text.View;
import java.util.List;
import java.util.Scanner;

/**
 * Created by admin on 14.04.2017.
 */
public class ToDoMain {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Выберите добавить(1), удалить(2) или отсортировать(3)");
            String cmd= s.nextLine();
            switch (cmd){
                case "1":
                    System.out.println("Введите задачу");
                    String task = s.nextLine();
                    list.Add(task);
                    break;
                case "2":
                    System.out.println(" вВЕДИТЕ НОМЕР ЗАПИСИ которую хотите удалить");
                    Integer t=Integer.parseInt(s.nextLine());
                    list.Delete(t);
                case "3":
                  List<Item> items= list.View();
                    for (Item item:items
                         ) {
                        System.out.println(item.getId()+"."+ item.getMessage());

                    }break;
            }
        }
    }
}
