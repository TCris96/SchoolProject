package com.school.demo.entity;

import com.school.demo.entity.subjectenum.Subject;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    @OneToOne(mappedBy = "classroom")
    private Teacher teacher;


}
