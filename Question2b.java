   public static void main(String[] args) {
        
        //Question 2b- Using a nested loop
        int rows = 6;
        int columns = 10;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++){
                if(i<3 && j<4){
                    System.out.print("*");
                }else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
    
}
