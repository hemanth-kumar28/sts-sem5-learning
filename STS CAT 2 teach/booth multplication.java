// You are using Java
class Main{
    
    static long boothmultiplication(int multiplier, int multiplicand){
        int previousBit = 0;
        long result = 0;
        
        for(int index = 0; index < 32; index++){
            
            int currentBit = (multiplier >> index) & 1;
            
            if(currentBit == 0 && previousBit == 1)
                result += (long) (multiplicand << index);
            else if(currentBit == 1 & previousBit == 0)
                result -= (long) (multiplicand << index);
        
            previousBit = currentBit;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
    int multiplier = 5;
    int multiplicand = 7;

    System.out.println(boothmultiplication(multiplier, multiplicand));
}
    
    
}