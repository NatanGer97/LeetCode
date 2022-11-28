package ThreeNumbersSum;

import javax.crypto.*;
import java.net.*;
import java.util.*;

public class Solution
{

    public boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights)
    {
        // Write your code here.
        // first we sort the 2 list and find the max num -> indicate witch row should be the back row;
        redShirtHeights.sort(Collections.reverseOrder());
        blueShirtHeights.sort(Collections.reverseOrder());

        if (blueShirtHeights.get(0) < redShirtHeights.get(0))
        {
            for (int i = 0; i < redShirtHeights.size(); i++)
            {
                if (redShirtHeights.get(i) <= blueShirtHeights.get(i))
                    return  false;

            }
        }
        else
        {

            for (int i = 0; i < blueShirtHeights.size(); i++)
            {
                if (redShirtHeights.get(i) >= blueShirtHeights.get(i))
                    return false;

            }

        }


        return true;
    }
}
