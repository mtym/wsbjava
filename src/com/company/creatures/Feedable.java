package com.company.creatures;

public interface Feedable {
    void Feed();

    default void Feed(Double foodWeight) {

    }


}
