package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {

    List<Integer> height = new ArrayList<>();

    public void addHeight (int height){
        this.height.add(height);
    }

    public List<Boolean> isHeightIncreasing(){
        List<Boolean> b = new ArrayList<>();
        for (int i = 1; i<height.size();i++){
            if (height.get(i-1) < height.get(i)){
                b.add(true);
            } else{
                b.add(false);
            }
        }
        return b;
    }

}