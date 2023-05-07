package me.ali.learningspringboot.service;

import me.ali.learningspringboot.model.ListItem;

public interface ListItemService {

    Iterable<ListItem> getListItems();
    ListItem createListItem(ListItem listItem);
    ListItem updateListItem(Long id, ListItem listItem);
    void deleteListItemById(Long id);

}
