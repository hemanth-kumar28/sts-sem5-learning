// unique sorted permutations

class Main{
    static int paths(int row, int col){
        
        int path = 1;
        
        for(int i = 1; i < row; i++){
            path = path * (col + i -1 )/i;
        }
        return path;
    }
    
    public static void main(String[] args) {
    int row = 10;
    int col = 6;

    System.out.println(paths(row, col));
}
    
}
