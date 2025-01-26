 public static void main(String[] args) {
        
        int rows = 4; //we are given 4 rows
        int columns = 12; //we are given 12 columns
        //loop through each row
        for(int i = 0; i<rows; i++){
            //loop through each column
            for(int j = 0; j<columns; j++){
                if (j<4 || j>=8){
                    System.out.print("*");
                }
                else{
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
