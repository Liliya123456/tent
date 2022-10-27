package taskFive;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static private List<Car> carList = new ArrayList<>();
    static private ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        Car volvo = new Car("blue", "Volvo",10);
        Car nissan = new Car("white","Nissan",15);
        Car opel = new Car("red","Opel",29);
        Car bmw = new Car("yellow","Bmw",18);
        carList.add(volvo);
        carList.add(nissan);
        carList.add(opel);
        carList.add(bmw);
        System.out.println("Antalet bilar är "+Car.count);
        saveCarToJSON();


    }
   static void saveCarToJSON()  {
        try{
            mapper.writeValue(Paths.get("src/main/resources/carsList.json").toFile(),carList);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
