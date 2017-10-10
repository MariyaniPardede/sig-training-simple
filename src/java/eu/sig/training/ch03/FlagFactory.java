package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {

    
	private static Map<Nationality, List<Color>> flagList = new HashMap<Nationality,List<Color>>();
    
    static {
           flagList.put(Nationality.GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
           flagList.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
           flagList.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
           flagList.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
           flagList.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
           flagList.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
           flagList.put(Nationality.HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
           flagList.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
           flagList.put(Nationality.RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }
    
 public List<Color> getFlagColors(Nationality nationality) {
     List<Color> result = flagList.get(nationality);
     if (result != null) return result;
     return Arrays.asList(Color.GRAY);
 }

}