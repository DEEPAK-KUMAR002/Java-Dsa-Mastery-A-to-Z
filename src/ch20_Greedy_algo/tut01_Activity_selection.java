package ch20_Greedy_algo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class tut01_Activity_selection {
    public static void main(String[] args) {//0(n)
        int start[]={1,3,0,5,8,5};
        int end[]  ={2,4,6,7,9,9};
        //start time and end time of activities
        //Activity 0 -> start = 1, end = 2
        //Activity 1 -> start = 3, end = 4
        //Activity 2 -> start = 0, end = 6
        //Activity 3 -> start = 5, end = 7
        //Activity 4 -> start = 8, end = 9
        //Activity 5 -> start = 5, end = 9
        //Sorting
        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //Lambda function -> shortForm
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
