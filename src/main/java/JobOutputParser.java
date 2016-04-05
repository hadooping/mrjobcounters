
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

public class JobOutputParser {

    public static void main(String[] args) {

          String filePath = "/Users/venkateshramasamy/dummy/job-trace.json";

        try {

            FileReader reader = new FileReader(filePath);
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            /*JSONArray mapTasks = (JSONArray) jsonObject.get("mapTasks");
            for (int i=0; i<mapTasks.size(); i++) {
                System.out.println(mapTasks.get(i));
            }

            Iterator i = mapTasks.iterator();
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                System.out.println("taskStatus "+ innerObj.get("taskStatus"));
            }*/



            String test = (String) jsonObject.get("outcome");
            System.out.println(test);


            /*JSONArray mapTasks = (JSONArray) jsonObject.get("mapTasks");
            for (int i=0; i<mapTasks.size(); i++) {
                System.out.println(mapTasks.get(i));
            }

            Iterator i = mapTasks.iterator();
            while (i.hasNext()) {
                JSONObject innerObj = (JSONObject) i.next();
                System.out.println("taskStatus "+ innerObj.get("taskStatus"));
            }*/


            /*System.out.println();
            JSONArray reduceTasks = (JSONArray) jsonObject.get("reduceTasks");
            for (int i=0; i<reduceTasks.size(); i++) {
                System.out.println(reduceTasks.get(i));
            }*/

        } catch (FileNotFoundException ex) {

            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();

        } catch (ParseException ex) {

            ex.printStackTrace();

        } catch (NullPointerException ex) {

            ex.printStackTrace();

        }

    }
}
