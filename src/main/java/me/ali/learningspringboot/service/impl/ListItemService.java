package me.ali.learningspringboot.service.impl;

import me.ali.learningspringboot.model.ListItem;
import me.ali.learningspringboot.repository.ListItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListItemService implements me.ali.learningspringboot.service.ListItemService {

    private final ListItemRepo listItemRepo;

    public ListItemService(ListItemRepo listItemRepo) {
        this.listItemRepo = listItemRepo;
    }

    @Override
    public List<ListItem> getCompletedListItems() {
        return listItemRepo.findListItemsByCompleted(true);
    }

    @Override
    public Iterable<ListItem> getUnCompletedListItems() {
        return listItemRepo.findListItemsByCompleted(false);
    }

    @Override
    public Iterable<ListItem> getListItems() {
        return listItemRepo.findAll();
    }

    @Override
    public ListItem createListItem(ListItem listItem) {
        return listItemRepo.save(listItem);
    }

    @Override
    public ListItem updateListItem(Long id, ListItem listItem) {
        listItem.setId(id);
        return listItemRepo.save(listItem);
    }

    @Override
    public void deleteListItemById(Long id) {
        listItemRepo.deleteById(id);
    }

}
