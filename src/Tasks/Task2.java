package Tasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(duplicateChars("Barack", "Obama"));
        System.out.println(dividedByThree(new int[]{3, 12, 7, 81, 52}));
        System.out.println(getInitials("simonov sergei evgenievich"));
        System.out.println(Arrays.toString(normalizator(new double[]{10.0, 10.0, 10.0, 10.0})));
        System.out.println(Arrays.toString(compressedNums(new double[]{1.6, 0, 212.3, 34.8, 0, 27.5})));
        System.out.println(camelToSnake("helloWorldPenisVPopeUMenya"));
        System.out.println(secondBiggest(new int[]{3, 5, 8, 1, 2, 4}));
        System.out.println(localReverse("Hello, I’m under the water, please help me", 'e'));
        System.out.println(equal(8, 1, 8));
        System.out.println(equal(5, 5, 5));
        System.out.println(equal(4, 9, 6));
        System.out.println(isAnagram("LISTEN", "silent"));
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
        System.out.println(isAnagram("hello", "world"));
    }

    public static String duplicateChars(String x, String y) {
        String x1 = x.toLowerCase(), y1 = y.toLowerCase();
        String str = "";
        for (int i = 0; i < x1.length(); i++) {
            if (y1.indexOf(x1.charAt(i)) == -1) {
                str += x.charAt(i);
            }
        }
        return str;
    }

    public static int dividedByThree(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0 && x[i] % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static String getInitials(String x) {
        String[] parts = x.split(" ");

        String initials = parts[1].toUpperCase().charAt(0) + "." + parts[2].toUpperCase().charAt(0) + ".";
        return initials + parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1).toLowerCase();
    }

    public static double[] normalizator(double[] x) {
        double min = x[0], max = x[0];
        for (double v : x) {
            if (v > max) max = v;

            if (v < min) min = v;
        }

        double[] array = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            array[i] = (x[i] - min) / (max - min);
        }

        return array;

    }

    public static int[] compressedNums(double[] x) {
        int count = 0;
        int countZero2 = 0;
        for (double v : x) {
            if (v == 0) {
                count++;
            }
        }
        int[] array = new int[x.length - count];
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                countZero2++;
            } else {
                array[i - countZero2] = (int) x[i];
            }
        }
        return array;
    }

    public static String camelToSnake(String x) {
        StringBuilder xCase = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (Character.isUpperCase(x.charAt(i))) {
                xCase.append('_');
            }
            xCase.append(Character.toLowerCase(x.charAt(i)));
        }
        return xCase.toString();
    }

    public static int secondBiggest(int[] x) {
        Arrays.sort(x);
        return x[x.length - 2];
    }

    public static String localReverse(String x, char y) {
        String[] xSplit = x.split(String.valueOf(y));
        StringBuilder res = new StringBuilder();
        boolean insideOrNo = false;

        for (int i = 0; i < xSplit.length; i++) {
            if (insideOrNo) {
                res.append(new StringBuilder(xSplit[i]).reverse());
            } else {
                res.append(xSplit[i]);
            }
            if (i <= xSplit.length - 1) {
                res.append(y);
            }
            insideOrNo = !insideOrNo;
        }
        return res.toString();
    }

    public static int equal(int x, int y, int z) {
        if (x == z && y == z) {
            return 3;
        } else if (x == z || y == z) {
            return 2;
        } else {
            return 0;
        }
    }

    public static boolean isAnagram(String x, String y) {
        String newX = x.replaceAll(" ", "").replaceAll("!","").replaceAll("\\.", "").replaceAll("\\?", "").toLowerCase();
        String newY = y.replaceAll(" ", "").replaceAll("!","").replaceAll("\\.", "").replaceAll("\\?", "").toLowerCase();


        if(newX.length() != newY.length()){
            return false;
        }else {
            char[] charX = newX.toCharArray();
            char[] charY = newY.toCharArray();
            Arrays.sort(charX);
            Arrays.sort(charY);
            return Arrays.equals(charX, charY);
        }

    }

}

