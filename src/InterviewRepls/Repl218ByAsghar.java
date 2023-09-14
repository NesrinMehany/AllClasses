package InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl218ByAsghar {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        items.add("switch");
        items.add("tv");
        System.out.println(countDeviceNames(items));
    }


    public static List<String> countDeviceNames(List<String> deviceNames) {

        String[] uniqueNames = new String[deviceNames.size()];

        for (int i = 0; i < deviceNames.size(); i++) {
            String deviceName = deviceNames.get(i);
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {

                if (uniqueNames[j].equals(deviceName)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                uniqueNames[i] = deviceName;
            } else {
                int id = 1;
                boolean exists = true;
                while (exists) {
                    exists = false;
                    for (int j = 0; j < i; j++) {
                        if (uniqueNames[j].equals(deviceName + id)) {
                            exists = true;

                            id++;


                            break;

                        }

                    }

                }


                uniqueNames[i] = deviceName + id;

            }

        }

        return Arrays.asList(uniqueNames);

    }
}
