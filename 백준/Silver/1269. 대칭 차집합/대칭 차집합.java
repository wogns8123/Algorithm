import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<Integer> Aset = new HashSet<>();
        HashSet<Integer> Bset = new HashSet<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<A; i++){
            Aset.add(Integer.parseInt(st2.nextToken()));
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<B; i++){
            Bset.add(Integer.parseInt(st3.nextToken()));
        }

        HashSet<Integer> Acopy = new HashSet<>(Aset);
        Acopy.removeAll(Bset);
        HashSet<Integer> Bcopy = new HashSet<>(Bset);
        Bcopy.removeAll(Aset);


        System.out.println(Acopy.size() + Bcopy.size());
    }
}
