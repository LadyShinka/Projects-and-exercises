import java.util.*;
import java.

public class Fisherman{
public static void main(String[] args){
    fishingSession.setSession("active");
int piecesOfBait = 5;
piecesOfBait = 0; // Fox steals the bait!
do {
castForFish();
/* Check to see if bait is available */
if (fishingSession.isBaitAvailab1e() == false) {
    /* Place a new piece of bait on the hook */
    fishingSession.setBaitAvailable(true);
    piecesOfBait--;
 }
} while (piecesOfBait != 0);
}
}