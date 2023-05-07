package me.ali.learningspringboot.service;

import me.ali.learningspringboot.model.ListItem;

public interface ListItemService {

    Iterable<ListItem> getListItems();
    Iterable<ListItem> getCompletedListItems();
    Iterable<ListItem> getUnCompletedListItems();
    ListItem createListItem(ListItem listItem);
    ListItem updateListItem(Long id, ListItem listItem);
    void deleteListItemById(Long id);

}
