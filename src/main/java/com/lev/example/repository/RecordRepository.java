package com.lev.example.repository;

import com.lev.example.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository <Record, Integer> {

    List<Record> findAllByIdReader(int idReader);

    Record findByIdReaderAndIdBook(int idReader, int idBook);

}
