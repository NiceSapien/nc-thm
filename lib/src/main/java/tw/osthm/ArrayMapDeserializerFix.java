package tw.osthm;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayMapDeserializerFix implements JsonDeserializer<ArrayList<HashMap<String, Object>>> {
    @Override
    public ArrayList<HashMap<String, Object>> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return (ArrayList<HashMap<String, Object>>) read(json);
    }

    public Object read(JsonElement in) {
        if (in.isJsonArray()) {
            List<Object> list = new ArrayList<Object>();
            JsonArray arr = in.getAsJsonArray();
            for (JsonElement anArr : arr) {
                list.add(read(anArr));
            }
            return list;
        } else if (in.isJsonObject()) {
            // Also here we fixed a bug where HashMap transformed into LinkedTreeMap, magic
            Map<String, Object> map = new HashMap<String, Object>();
            JsonObject obj = in.getAsJsonObject();
            Set<Map.Entry<String, JsonElement>> entitySet = obj.entrySet();
            for (Map.Entry<String, JsonElement> entry : entitySet) {
                map.put(entry.getKey(), read(entry.getValue()));
            }
            return map;
        } else if (in.isJsonPrimitive()) {
            JsonPrimitive prim = in.getAsJsonPrimitive();
            if (prim.isBoolean()) {
                return prim.getAsBoolean();
            } else if (prim.isString()) {
                return prim.getAsString();
            } else if (prim.isNumber()) {

                Number num = prim.getAsNumber();
                // In here we fixed that damn bug where it converts double to int
                if (Math.ceil(num.doubleValue()) == num.intValue())
                    return num.intValue();
                else {
                    return num.doubleValue();
                }
            }
        }
        return null;
    }
}
