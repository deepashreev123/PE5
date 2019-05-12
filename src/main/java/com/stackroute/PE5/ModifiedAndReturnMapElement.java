/*Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
    Modify and return the given map as follows:
    a. If the key `val1` has a value, set the key `val2` to have that value, and
    b. Set the key `val1` to have the value `" "` (empty string).
    Example 1:
    The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
        "java"}
    Example 2:
    The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
        "mars"}*/


package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class ModifiedAndReturnMapElement {
    public static String replacingtheValue(Map<String, String> map) {
        if (map == null) {
            return null;//if map is null retuen null
        }
        String value1 = map.get("value1");
        map.replace("value2", value1);//replacing the value2
        map.replace("value1", " ");
        return map.toString();
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("value1", "java");
        map.put("value2", "c++");
        String result = ModifiedAndReturnMapElement.replacingtheValue(map);//calling the method
        System.out.println(map.toString());
    }

}