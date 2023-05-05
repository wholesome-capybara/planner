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

    private final ToDoItemService itemService;

    @GetMapping(value = "/greeting",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "{\"name\":\"cos\"}";
    }

    @GetMapping("/item")
    Collection<ToDoItem> getItems() {
        return itemService.getAll();
    }

    @PostMapping("/item")
    ToDoItem createItem(@RequestBody ToDoItem toDoItem) {
        return itemService.save(toDoItem);
    }

}
