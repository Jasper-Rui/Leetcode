

import java.util.*;
import java.util.stream.Collectors;

public class test{

    List<Integer> pulledNumbers = new ArrayList<>();
    List<Bingo> bingoCards = new ArrayList<>();

    public long solveOne() {
        for (Integer i : pulledNumbers) {
            for (Bingo b : bingoCards) {
                b.markInt(i);
                if (b.isValid()) {
                    return b.getUnmarkedSum() * i;
                }
            }
        }
        return 0;
    }

    @Override
    public long solveTwo() {
        Bingo lastToWin = null;
        int lastNumberPulled = 0;
        Set<Bingo> bingoSet = new HashSet<>();
        for (Integer i : pulledNumbers) {
            for (Bingo b : bingoCards) {
                if (!bingoSet.contains(b)) b.markInt(i);
                if (b.isValid()) {
                    if (!bingoSet.contains(b)) {
                        bingoSet.add(b);
                        lastToWin = b;
                        lastNumberPulled = i;
                    }
                }
            }
        }
