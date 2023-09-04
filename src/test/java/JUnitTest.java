import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 2 = 3") // 테스트 이름.
    @Test // 테스트 메소드.
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(a + b, sum);
        /*
        * 값이 같은지 확인.
        * assertEquals(a, b) : a와 b가 같은지 확인.
        * a == 기대하는 값.
        * b == 실제 값.
        * a 와 b 를 더한 값이 sum 과 같아야 한다.
        * assertThat(a + b).inEqualTo(sum);
        */
    }

    /*@DisplayName("1 + 3는 4이다")
      @Test
      public void junitFailedTest() {
          int a = 1;
          int b = 3;
          int sum = 3;

          Assertions.assertEquals(a + b, sum);
      }*/
}
