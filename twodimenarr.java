public class twodimenarr {
   public static void main(String[] args){
    int[][] threeDpoints=new int[][]{{1,20,30} ,{-2,5,6} ,{5,19,-12}};
    int rows=threeDpoints.length;
    for(int i=0;i<rows;i++){
        System.out.println("Point number "+(1 + 1)+"= (x: " + threeDpoints[i][0] + " ,Y: " +threeDpoints[i][1] + " , Z:" + threeDpoints[i][2] + " )");
    }
}

}