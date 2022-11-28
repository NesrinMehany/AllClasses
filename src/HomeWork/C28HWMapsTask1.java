package HomeWork;

import java.util.LinkedHashMap;

public class C28HWMapsTask1 {
    /*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> floorPlan= new LinkedHashMap<>();
        floorPlan.put(1, "FaceBook");
        floorPlan.put(2, "Google");
        floorPlan.put(3, "MicroSoft");
        floorPlan.put(4, "Deloitte");
        floorPlan.put(5, "IBM");
        floorPlan.put(6, "KPMG");
        floorPlan.put(7, "Ernst&young");
        floorPlan.put(5, "Deloitte");
        //Check how many entries you have?
        System.out.println("My floor plan contains "+ floorPlan.size() +" companies");
        //Update company on a 4th floor
        System.out.println(floorPlan);
        floorPlan.put(4,"Syntax");
        System.out.println(floorPlan);
//Remove company on the 7th floor
        floorPlan.remove(7);
        System.out.println(floorPlan);
    }
}
