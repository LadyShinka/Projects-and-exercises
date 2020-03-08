
import java.util.*;
public class FishLength {
    public static void main(String[] args){
    List<Float> fishLengthList = new ArrayList<>();
    fishLengthList.add(10.0f);
    fishLengthList.add(15.5f);
	fishLengthList.add(18.0f);
	fishLengthList.add(29.5f);
	fishLengthList.add(45.5f);
	for(float fish: fishLengthList) {
	if (fish > 28)
	System.out.println(fish + " ");
	}	
  }
}
