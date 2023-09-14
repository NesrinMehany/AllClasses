package InterviewRepls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl218Abdul {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("switch", "tv", "switch", "radio", "radio","tv", "switch", "switch","tv"));
        System.out.println(countDeviceNames(list));
    }
    /*public static List<String> countDeviceNames(ArrayList<String> input)
    {

        String[] output = new String[input.size()];
        String temp = "";
        int num = 0;

        for (int i = 0; i < input.size(); i ++)
        {
            //iterate over input list and grab element at i
            num = 0;
            temp = input.get(i);

            //now we need to check output list if this element already exists
            for (int j = 0; j < output.length; j++)
            {
                //element was not found in output list, and we are placing element in the first empty index
                if (output[j] == null)
                {
                    output[j] = temp;
                    j = output.length;
                }

                //if element is found in the output list
                if (j < output.length && temp.equals(output[j]))
                {
                    //increment j because we need to start looking at the next element
                    j++;
                    //we know we've found one duplicate element already, so increment num to 1
                    //because it serves as the number to be placed after string element
                    num++;
//for loop to iterate to the end of output list
                    //we dont need to declare a new variable, because we are starting at index j, which was already
                    //incremented above, so j is already pointing to the next index
                    for (; j < output.length; j++)
                    {
                        //if we found a null index, place new element there with num
                        if (output[j] == null)
                        {
                            output[j] = temp + num;
                            j = output.length;
                        }
                        //as we move through output list, every time we find a duplicate element with a num, we need to
                        //increment num to signify the number of this element
                        //so for example if we have a tv, and tv1, in the list, this makes sure we increment num to 3
                        //that way we can store tv3 in the next empty index
                        else if (output[j].equals(temp + num))
                        {
                            num++;
                        }
                    }

                }
            }
        }


        return Arrays.asList(output);
    }*/

    public static List<String> countDeviceNames(ArrayList<String> input)
    {

        String[] output = new String[input.size()];
        String temp = "";
        int num = 0;

        for (int i = 0; i < input.size(); i ++)                                      //i=0 first element
        {
            num = 0;
            temp = input.get(i);                                                       //first element
            for (int j = 0; j < output.length; j++)
            {

                if (output[j] == null)                                               //adding first elemen to output
                {
                    output[j] = temp;
                    j = output.length;
                }

                if (j < output.length && temp.equals(output[j]))
                {
                    j++;
                    num++;
                    for (; j < output.length; j++)
                    {
                        if (output[j] == null)
                        {
                            output[j] = temp + num;
                            j = output.length;
                        }
                        else if (output[j].equals(temp + num))
                        {
                            num++;
                        }
                    }

                }
            }
        }
        return Arrays.asList(output);
    }
}
