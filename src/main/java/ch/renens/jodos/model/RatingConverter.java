package ch.renens.jodos.model;

import javax.persistence.AttributeConverter;

public class RatingConverter implements AttributeConverter<Rating, String> {

    @Override
    public String convertToDatabaseColumn(Rating rating) {
        return rating.getDescription();
    }

    @Override
    public Rating convertToEntityAttribute(String description) {
        return Rating.byDescription(description);
    }
}
