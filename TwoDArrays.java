class TwoDArrays {
  public static void main(String[] args) {
         
    //Create a two-dimensional array
    //to store Boolean values relating to
    //XY coordinates  (5 rows, 20 cols)
    boolean[][] points = new boolean[5][20];
        
    //Define one Y point on each X axis
    points[0][5]  = true;  //first row, sixth col
    points[1][6]  = true; //second row, seventh col
    points[2][7]  = true; //third row, eight col
    points[3][8]  = true; //fourth row, ninth col
    points[4][9]  = true; //fifth row, tenth col 
        
    //Output the grid
    //Add a for loop to iterate through the first array index
    //adding a newline character at end of each iteration
    for (int i=0; i<points.length; i++){
            
      //nested for loop to iterate through the second 
      // array index (processing columns)
      for(int j=0; j <points[0].length; j++) {
        //System.out.print(points[i][j]);
        char mark =(points[i][j])?'X':'-';
        System.out.print(mark);
      } //end innner for loop
            
      System.out.print("\n");
    } //end outer for loop
        
  } //end main 
    
} //end class
