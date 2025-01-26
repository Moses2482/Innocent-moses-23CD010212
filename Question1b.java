public static void main(String[] args) {
        
        int rows = 4; //number of rows
        int columns = 12; //number of columns
        //loop through each row
        for(int i=0; i<rows; i++){
            //Nested loop to print each column in the row
            for(int j= 0; j<columns; j++){
                if (j<4) {   //first 4 columns
                    System.out.print("*");
                }else if(j>=4 && j<8) {  //middle 4 columns
                    System.out.print("=");
                }else{   //last 4 columns
                    System.out.print("*");
                }
            }
            System.out.println();  //move to the next row
        }
    }
    
