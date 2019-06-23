import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.*;
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(String str: cpdomains){
            String[] temp= str.split(" ");
            int number = Integer.parseInt(temp[0]);

        }

        return list;
    }
}


public class MainClass {
    public static String[] stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }

    public static String stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }

        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] cpdomains = stringToStringArray(line);

            List<String> ret = new Solution().subdomainVisits(cpdomains);

            String out = stringListToString(ret);

            System.out.print(out);
        }
    }
}