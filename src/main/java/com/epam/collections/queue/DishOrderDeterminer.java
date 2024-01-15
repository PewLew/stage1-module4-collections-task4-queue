package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishes = new ArrayList<>();
        int sum = 0;
        while(dishes.size()!=numberOfDishes){
            sum += everyDishNumberToEat;
            if(sum >numberOfDishes)
                sum = sum-numberOfDishes;
            System.out.print(sum + " ");
            if(!dishes.contains(sum))
                dishes.add(sum);
        }
        return dishes;
    }
}
