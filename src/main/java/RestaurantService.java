import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    Restaurant restaurant =  new Restaurant("Tandoori Flames", "Surrey", LocalTime.of(8,00), LocalTime.of(22,30));
    restaurantNotFoundException restaurantNotFoundException = new restaurantNotFoundException("Restaurant is not available");

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException{

        if(restaurantName.equals("Tandoori Flames"))
            return restaurant;
        else
             throw restaurantNotFoundException;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
