package ch.renens.jodos.model;

import java.util.HashMap;
import java.util.Map;

public enum Rating {

    G("G"), NC_18("NC-18"), PG("PG"), PG_13("PG-13"), R("R");

    String description;

    private Rating(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static final Map<String, Rating> ratings = new HashMap<>();

    static {
        for (Rating rating : Rating.values()) {
            ratings.put(rating.getDescription(), rating);
        }
    }

    public static Rating byDescription(String description) {
        return ratings.get(description);
    }
}
