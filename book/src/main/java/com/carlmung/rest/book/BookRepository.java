package com.carlmung.rest.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="user")
public interface BookRepository extends JpaRepository<Book, Integer> {
}
