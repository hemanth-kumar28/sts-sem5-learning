// 1. check if all divisor pair coprime
// 2. total divisor product
// 3. find partial product for each
// 4. find inverse , 
// for(int j = 0; j < m[i]; j++){
//     if((partial * j) % m[i] == 1){
//         inverse = j;
//         break
//     }
// }
// 5. sum += remainder[i] * partial * inverse
// 6.end loop
// 7. answer = sum % product

class Main {
    public static void main(String[] args) {

        int[] m = {2, 5, 7};
        int[] a = {1, 1, 4};

        int product = 1;
        int sum = 0;

        for (int value : m) {
            product *= value;
        }

        for (int i = 0; i < m.length; i++) {

            int partial = product / m[i];
            int inverse = 0;

            for (int j = 1; j < m[i]; j++) {
                if ((partial * j) % m[i] == 1) {
                    inverse = j;
                    break;
                }
            }

            sum += a[i] * partial * inverse;
        }

        System.out.println(sum % product);
    }
}