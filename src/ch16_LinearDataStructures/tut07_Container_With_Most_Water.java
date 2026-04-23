package ch16_LinearDataStructures;

import java.util.ArrayList;

public class tut07_Container_With_Most_Water {
    //method 1
    public static int StoreWater(ArrayList<Integer> height){
        int maxwater=0;
        //Brute Force
        //Time Complexicity=0(n^2)
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));//7
                int width=j-i;//7
                int currentwater =ht*width;//49
                maxwater=Math.max(maxwater,currentwater);
            }
        }
        return maxwater;
    }



    //method 2
    public static int storewater2pointer(ArrayList<Integer> height) {
        int Maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        //Time Complexicity=0(n)
        while (lp<rp){
            //Calculate water area
            int Ht=Math.min(height.get(lp),height.get(rp));
            int width = rp - lp;
            int Currentwater = Ht*width;
            Maxwater = Math.max(Maxwater,Currentwater);
            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return Maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoreWater(height));
        System.out.println(storewater2pointer(height));
    }
}
