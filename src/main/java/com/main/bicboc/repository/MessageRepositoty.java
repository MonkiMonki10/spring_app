package com.main.bicboc.repository;

import com.main.bicboc.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepositoty extends CrudRepository<Message, Long>
{
    List<Message> findByTag(String tag);
}
