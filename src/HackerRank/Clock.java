package HackerRank;

public class Clock {
    public static void main(String[] args) {

        String time = "07:05:45PM";
        System.out.println(timeConversion(time));
    }
        public static String timeConversion(String time){
            String[] splitted = time.split(":");
            int h = Integer.parseInt(splitted[0]);

            if (time.contains("PM")) {
                if (h != 12) {
                    h = h + 12;
                    splitted[0] = String.valueOf(h);
                }
            } else if (h == 12) {
                splitted[0] = "00";
            }

            String newTimeeFormmat = splitted[0] + ":" + splitted[1] + ":" + splitted[2].substring(0,2);
            return newTimeeFormmat;
        }
    }



