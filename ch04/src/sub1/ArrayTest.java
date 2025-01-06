package sub1;

public class ArrayTest {
  public static void main(String[] args) {
    // 배열
    int[] arr1 = {1, 2, 3, 4, 5};
    char[] arr2 = {'A', 'B', 'C'};
    String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};

    // These lines don't print their elements
    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println(arr3);

    // 배열값 참조
    System.out.println("arr1[0] :" + arr1[0]);
    System.out.println("arr1[2] :" + arr1[2]);
    System.out.println("arr1[4] :" + arr1[4]);

    System.out.println("arr2[1] :" + arr2[1]);
    System.out.println("arr3[1] :" + arr3[1]);
    System.out.println("arr3[3] :" + arr3[3]);
    System.out.println("arr3[4] :" + arr3[4]);

    // 배열의 길이
    System.out.println("Length of arr1: " + arr1.length);
    System.out.println("Length of arr2: " + arr2.length);
    System.out.println("Length of arr3: " + arr3.length);

    // 배열의 반복문
    for (int i = 0; i < arr1.length; i++) {
      System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
    }

    for (char c : arr2) { // 배열의 길이만큼 반복, 각 인덱스의 값을 변수 n에 대입
      System.out.println(c);
    }

    for (String s : arr3) {
      System.out.println(s);
    }

    for (int j = 0; j < arr3.length; j++) {
      System.out.printf("arr3[%d] = %s\n", j, arr3[j]);
    }

    // 1차원 배열
    int[] scores = {80, 60, 78, 62, 92};
    int total = 0;
    for (int score : scores) {
      total += score;
    }
    System.out.println(total);

    // 2차원 배열
    int[][] twoDimArr = {{10, 20, 30}, {1, 2, 3, 4}, {100, 200}, {3, 6, 1, 1, 4, 7, 8, 0}};
    for (int i = 0; i < twoDimArr.length; i++) {
      for (int j = 0; j < twoDimArr[i].length; j++) {
        System.out.println(twoDimArr[i][j]);
      }
    }

    // 3차원 배열
    int[][][] threeDimArr = {{{1}, {2}, {3}}, {{23, 6, 61, 135}, {2, 14, 6, 134}}};
  }
}
