package me.ali.learningspringboot.controller;

import me.ali.learningspringboot.model.ListItem;
import me.ali.learningspringboot.service.impl.ListItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
@CrossOrigin
public class ListItemController {

    private final ListItemService listItemService;

    public ListItemController(ListItemService listItemService) {
        this.listItemService = listItemService;
    }

    @GetMapping("/list")
    public Iterable<ListItem> getListItems() {
        return listItemService.getListItems();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/add")
    public ListItem createListItem(@RequestBody ListItem listItem) {
        return listItemService.createListItem(listItem);
    }

    @PutMapping("/{id}")
    public ListItem updateListItem(@PathVariable Long id, @RequestBody ListItem listItem) {
        listItem.setId(id);
        return listItemService.updateListItem(id, listItem);
    }

    @DeleteMapping("/{id}")
    public void deleteListItemById(@PathVariable Long id) {
        listItemService.deleteListItemById(id);
    }

}
