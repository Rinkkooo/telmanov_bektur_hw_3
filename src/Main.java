public class Main {
    public static void main(String[] args) {
        float sum = 0;
        int count = 1;
        boolean negativeNum = false;
        float[] array = {3.14f, 2.71828f, -0.5f, 1.61803f, -4.66920f, 0.57721f, -1.73205f, 0.70711f, -1.41421f, 0.86603f, -1.25992f, 0.61803f, -1.30357f, 0.61803f, -1.22074f};
        for (float num : array){
            if (num < 0){
                negativeNum = true;
            } else if (negativeNum) {
                sum += num;
                count = count + 1;
            }
        }
        float result = sum / count;
        System.out.println(result);

    }
}