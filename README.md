# jv-lottery

Let's create a simple lottery that will return balls with a random color and random number.

Your tasks are:
- create a `Ball` class with the following fields: `color` and `number` and override the `toString()` method
- create an enum with different colors
- implement method `getRandomColor()` in class `ColorSupplier`. 
This method should return a random color, based on the enum values (use the `Random` class for this) 

Then create a `Lottery` class with the `getRandomBall()` method, which will return the ball.
This method should create a ball with a random color and a random number (the maximum possible number should be 100) and return this ball from the method.

To test the program, in the main() method, create three balls using the `getRandomBall()` method from the `Lottery` class.
And print information about them in the console.

#### [Try to avoid these common mistakes, while solving task](./checklist.md)
jv-lottery

Давай створимо просту лотерею, яка повертатиме кульки з випадковим кольором і випадковим номером.

Твої завдання:

створити клас Ball з такими полями: color і number, та перевизначити метод toString()

створити enum з різними кольорами

реалізувати метод getRandomColor() у класі ColorSupplier
Цей метод має повертати випадковий колір, базуючись на значеннях enum (використовуй клас Random)

Далі створи клас Lottery з методом getRandomBall(), який повертатиме кульку.
Цей метод має:

створювати кульку з випадковим кольором

створювати кульку з випадковим номером (максимальне можливе число — 100)

повертати цю кульку з методу

Для перевірки програми:

У методі main() створи три кульки, використовуючи метод getRandomBall() класу Lottery,
та виведи інформацію про них у консоль.