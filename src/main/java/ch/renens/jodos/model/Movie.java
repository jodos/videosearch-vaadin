package ch.renens.jodos.model;

import java.io.Serializable;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String retailPrice;
    private String rentalPrice;
    private int copiesPurchased;
    @ManyToOne(targetEntity = Category.class)
    private Category category;
    @Convert(converter = RatingConverter.class)
    private Rating rating;

}
