public class MainClass {
    
    public static void main(String[]args){
        
        int[][] myGrid = { {5,98,2,0}, {100,32,495,8}, {111,2,322,5} };
        printMaxOfEachRow(myGrid);
    }
    
    public static void printMaxOfEachRow(int[][] inputArray){
       
        int maxOfEachRow;  
        for(int row = 0; row < inputArray.length; row++){
            
            maxOfEachRow = inputArray[row][0];
            for(int col = 0; col < inputArray[row].length; col++){
                if(inputArray[row][col] > maxOfEachRow){
                    maxOfEachRow = inputArray[row][col];
                }
            }
               
            System.out.println("The maximum value at row " + row + " is: " + maxOfEachRow);                                             
                         
        }
    }
}
    
//Notes and questions

    //System.out.println("The value of this element is: " + inputArray[row][col]);//
     //System.out.println("The value of this element is: " + inputArray[row][col]);//           
//        myGrid[row_index][column_index]
//        System.out.println(myGrid[1][3]) prints out the element located in the 2nd row and 4th column
//        To change the value of the value of the 1st row and 2nd column you would do:
//        myGrid[0][1] = 50;
//          to loop through a 2-dimensional array you need one loop to loop through the columns and one loop to loop through the rows
//                  that looks like this:
//                  for (int row = 0; row < myGrid.length; row++){
//                      for (int col = 0; col < myGrid[row].length]; col++) {
//                         board[row][col] = 100; <-- this puts 
//                  }
//   