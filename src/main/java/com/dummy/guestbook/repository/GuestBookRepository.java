package com.dummy.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dummy.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer>{
    
}
