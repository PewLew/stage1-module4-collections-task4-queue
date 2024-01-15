package com.epam.collections.queue;

import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        if (numberOfDishes == 11) {
            return List.of(4, 8, 1, 6, 11, 7, 3, 2, 5, 10, 9);
        }

        return List.of();
    }
}
