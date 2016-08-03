import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class JsonChangJOPO {
     
    public static void main(String[] args) {
        String json = "{\"--e-----lEUAKGf5M1YS\":{\"content\":\"Fads faded\",\"toUserId\":\"aa\",\"fromUserId\":\"2\"}}";
        String json2 = json.substring(json.indexOf(":")+1, json.length()-1);
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(json2);
        String content = object.get("content").getAsString();
        String fromUserId = object.get("fromUserId").getAsString();
        
//        String toUserId = object.get("toUserId").getAsString();
//        String toGroupId = object.get("toGroupId").getAsString();
//        
        System.out.println(content + "----------" + fromUserId);

        if (object.get("toUserId").getAsString() != null && !object.get("toUserId").getAsString().equals("")) {
            System.out.println("toUserId");
            return ;
        }
        if (object.get("toGroupId").getAsString() != null) {
            System.out.println("toGroupId");
            return ;
        }
        System.out.println("aaaasdad");
    }
}
