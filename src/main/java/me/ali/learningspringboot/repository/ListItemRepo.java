package me.ali.learningspringboot.repository;

import me.ali.learningspringboot.model.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListItemRepo extends JpaRepository<ListItem, Long> {
}
