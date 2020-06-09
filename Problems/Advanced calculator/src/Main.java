/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        int max = 0;
        int min = Integer.parseInt(args[1]);
        //System.out.println(min);
        //System.out.println(operator);
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > max) {
                max = Integer.parseInt(args[i]);
            }
        }
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(args[i]) < min) {
                min = Integer.parseInt(args[i]);
            }
        }
        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        if (operator.equals("MAX")) {
            System.out.println(max);
        } else if (operator.equals("MIN")) {
            System.out.println(min);
        } else {
            System.out.println(sum);
        }

    }
}