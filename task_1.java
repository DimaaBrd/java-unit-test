@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Пользователь несовершеннолетний", true, isAdult);// Напиши код здесь
}