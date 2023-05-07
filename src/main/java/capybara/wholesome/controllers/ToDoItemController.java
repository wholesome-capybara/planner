package capybara.wholesome.controllers;

import capybara.wholesome.model.ToDoItem;
import capybara.wholesome.services.ToDoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    @GetMapping(value = "/greeting",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "{\"name\":\"cos\"}";
    }

    @GetMapping("/item")
    Collection<ToDoItem> getToDoItems() {
        return toDoItemService.getAll();
    }

    @PostMapping("/item")
    ToDoItem createToDoItem(@RequestBody ToDoItem toDoItem) {
        return toDoItemService.save(toDoItem);
    }

}
