    public static void main(String[] args) {
        int rows = 6;
        int columns = 10;
        //loop through each row
        for (int i=0; i<rows; i++){
            //loop through each column
            for(int j = 0; j<columns; j++){
                if(i < 3 && j<4){
                    System.out.print("*");
                }else if(i%2==0){
                    System.out.print("=");
                }else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
}
