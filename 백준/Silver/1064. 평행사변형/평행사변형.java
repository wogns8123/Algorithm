import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static double distance(int ax, int ay, int bx, int by){
        double result = Math.sqrt(Math.pow(ax - bx, 2)+ Math.pow(ay-by, 2));
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        int cx = Integer.parseInt(st.nextToken());
        int cy = Integer.parseInt(st.nextToken());

        if((bx-ax) * (cy-ay) == (cx-ax) * (by-ay)){
            System.out.println("-1.0");
            return;
        }

        double d1 = distance(ax,ay, bx,by);
        double d2 = distance(ax,ay, cx,cy);
        double d3 = distance(cx,cy, bx,by);
        double can1 = 2* (d1 + d2);
        double can2 = 2* (d1 + d3);
        double can3 = 2* (d2 + d3);

        double max = Math.max(can1, Math.max(can2, can3));
        double min = Math.min(can1, Math.min(can2, can3));
        System.out.println(max-min);

    }
}
