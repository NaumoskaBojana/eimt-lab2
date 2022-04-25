package mk.ukim.finki.emt.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mk.ukim.finki.emt.backend.model.enumerations.Category;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    private Author author;

    private Integer freeCopies;

    public Book(String name, Category category, Author author, Integer freeCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.freeCopies = freeCopies;
    }
}
