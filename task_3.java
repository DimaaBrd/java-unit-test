@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result; // Инициализация полей класса в конструкторе
    }

    @Parameterized.Parameters
    public static Object[] getTextData() {
        return new Object[][] {
            {17, false},   // Несовершеннолетний
            {18, true},    // Совершеннолетний   // Совершеннолетний
            {20, true},    // Совершеннолетний
            {21, true}     // Совершеннолетний, возможно с учетом страны
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передача возраста пользователя
        boolean isAdult = program.checkIsAdult(age); 
        // Сравнение полученного и ожидаемого результатов, с сообщением об ошибке
        assertEquals("Неправильный результат для возраста ", result, isAdult);
    }
}