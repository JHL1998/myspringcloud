package com.luojianhua.repository;

import com.luojianhua.entity.Student;

import java.util.Collection;

public interface StudentRepository  {
    public Collection<Student>findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
