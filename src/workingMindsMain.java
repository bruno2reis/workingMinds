import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class workingMindsMain {
    static void findNumberMissing(int arr[], int n)
    {
        List<Integer> listAll = new ArrayList<>();
        boolean []ListNumberOut = new boolean[n+1];
        for (int i = 0; i < n-31; i++)
            ListNumberOut[arr[i]] = true;

        System.out.println("Mapeando todos os números.");
        for (int i = 1; i <= n; i++)
            if (! ListNumberOut[i])
                listAll.add(i);
        System.out.println(listAll);
    }

    public static void main(String[] args) {

        List<Integer> listminds = Arrays.asList( 32, 47, 41, 7, 47, 9, 36, 32, 20, 15 , 11, 9, 6, 37, 9, 39, 45, 29, 29, 19, 28, 21, 50, 19, 43 );

        List<Integer> order = listminds.stream().sorted()
                .distinct()
                .collect(Collectors.toList());

        int [] otestB = order.stream().mapToInt(Integer::intValue).toArray();

        int n = 31 + otestB.length;

        findNumberMissing(otestB, n);
    }
}
