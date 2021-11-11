/**
Interface for Relatable
From 10.9 Interfaces, page 669
*/

public interface Relatable {

    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}

