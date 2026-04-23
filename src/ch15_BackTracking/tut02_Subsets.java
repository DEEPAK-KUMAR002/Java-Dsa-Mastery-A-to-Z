package ch15_BackTracking;

public class tut02_Subsets {
    public static void findSubsets(String str,String ans,int i)//str,"",0
    {
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else {
                System.out.print(ans+" ");
            }
            return;
        }
        //yes Choice
        findSubsets(str,ans+str.charAt(i),i+1);//abc,a,1
        //No Choice
        findSubsets(str,ans,i+1);//abc,"",1
    }
    public static void main(String[] args) {
        String str="abc";
        findSubsets(str,"",0);
    }
}
