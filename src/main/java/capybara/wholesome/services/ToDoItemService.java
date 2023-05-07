package capybara.wholesome.services;

import capybara.wholesome.model.ToDoItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoItemService {

    private final List<ToDoItem> toDoItems = new ArrayList<>();

    public List<ToDoItem> getAll() {
        return toDoItems;
    }

    public ToDoItem save(ToDoItem toDoItem) {
         toDoItems.add(toDoItem);
         return toDoItem;
    }

}
