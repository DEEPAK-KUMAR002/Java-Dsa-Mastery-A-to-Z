package ch07_1D_Array;

public class tut12_TrappedRainwater {
    public static int trappedRainwater(int height[])//arr
    { //0(n)
        int n=height.length;//7
        //calculate left max boundary - array
        int leftMax[] = new int[n];//7 size array
        leftMax[0] = height[0];// 4
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);//4(0) 4 4 6 6 6 6
        }
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];//5
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);//6 6 6 6 5 5 5(6)
        }
        int trappedwater = 0;
        //loop
        for(int i=0;i<n;i++){
            //waterleve = min(leftmax bound,rightmax bound)
            int waterlevel = Math.min(leftMax[i],rightMax[i]);//4 4 4 6 6 6 6
            //trapped water = waterLevel - Height[i]
            trappedwater += waterlevel-height[i];//0 2 4 0 2 3 0=
        }
        return trappedwater;//11
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(height.length);
        System.out.println(trappedRainwater(height));
    }
}
