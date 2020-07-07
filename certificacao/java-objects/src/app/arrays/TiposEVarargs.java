package app.arrays;

public class TiposEVarargs {
    public static void main(String[] args) {
        // SortSearching { [SortSearching@3454] [SortSearching@5785] [null] }
        SortSearching[] sorts = new SortSearching[3];
        sorts[0] = new SortSearching();
        sorts[1] = new SortSearching();

        System.out.println("######################");
        for (SortSearching item : sorts) 
            System.out.println(item);

        int res = validaVarargs(1, 3, 8, 4, 1);
        System.out.println("Soma = " + res);
    }


    static int validaVarargs(int...nums) {
        int soma = 0;

        int item3 = nums[3];

        for (int i : nums) 
            soma += i;
        
        return soma;
    }
}