import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 모든 테스트가 실행되기 전에 딱 한 번 실행. static 메소드로 선언해야 함.
    public static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach // 각각의 테스트가 실행되기 전에 실행.
    public void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    public void junitTest() {
        System.out.println("junitTest");
    }

    @Test
    public void junitTest2() {
        System.out.println("junitTest2");
    }

    @Test
    public void junitTest3() {
        System.out.println("junitTest3");
    }

    @AfterAll // 모든 테스트가 실행된 후에 딱 한 번 실행. static 메소드로 선언해야 함.
    public static void afterAll() {
        System.out.println("AfterAll");
    }

    @AfterEach // 각각의 테스트가 실행된 후에 실행.
    public void afterEach() {
        System.out.println("AfterEach");
    }
}
