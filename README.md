# Практика 1 — Синтаксис Java, массивы, ввод/вывод

**Студент:** Баранов Дмитрий Максимович  
**Курс:** 3  
**Пакет:** `ru.mirea.baranov.pr1`

## Файлы

- `ArrayStats.java` — сумма и среднее массива-инициализации, ввод массива с клавиатуры, сумма через `while` и `do-while`, min/max.
- `CommandLine.java` — вывод аргументов командной строки.
- `Harmonic.java` — первые 10 членов гармонического ряда с форматированием.
- `Fact.java` — факториал через цикл, `BigInteger`.

## Запуск

```bash
javac -encoding UTF-8 -d out src/ru/mirea/baranov/pr1/*.java
java -cp out ru.mirea.baranov.pr1.ArrayStats
java -cp out ru.mirea.baranov.pr1.CommandLine один два три
java -cp out ru.mirea.baranov.pr1.Harmonic
java -cp out ru.mirea.baranov.pr1.Fact

# Практика 2 — UML-диаграммы: Author и Ball

**Студент:** Баранов Дмитрий Максимович  
**Курс:** 3  
**Пакет:** `ru.mirea.baranov.pr2`

## Цель

Спроектировать классы по UML-диаграмме: поля, конструкторы, геттеры/сеттеры, переопределённый `toString()`, тестовый класс.

## Файлы

| Файл | Назначение |
|---|---|
| `Author.java` | Автор: `name`, `email`, `gender` (`M`/`F`/`U`) |
| `TestAuthor.java` | Создание автора, смена email, вывод полей |
| `Ball.java` | Мяч: координаты, скорость, `move()` и `move(dx, dy)` |
| `TestBall.java` | Движение по смещению и по скорости |

## Диаграмма → код

### Author

| UML | Код |
|---|---|
| `- name : String` | `private final String name` |
| `- email : String` | `private String email` |
| `- gender : char` | `private final char gender` |
| `+ Author(name, email, gender)` | конструктор с валидацией |
| `+ getName()` / `+ getEmail()` / `+ getGender()` | геттеры |
| `+ setEmail(email)` | сеттер (name и gender неизменяемы) |
| `+ toString()` | `"Имя (M) at email"` |

### Ball

| UML | Код |
|---|---|
| `- x : double = 0.0` | `private double x` |
| `- y : double = 0.0` | `private double y` |
| `+ Ball()` / `+ Ball(x, y)` | оба конструктора |
| `+ setXY(x, y)` | есть |
| `+ move(dx, dy)` | есть |
| `+ toString()` | `"Ball(x, y)"` |

Дополнительно: поля `vx`, `vy`, метод `setSpeed()` и `move()` без аргументов.

## Запуск

```bash
javac -encoding UTF-8 -d out src/ru/mirea/baranov/pr2/*.java
java -cp out ru.mirea.baranov.pr2.TestAuthor
java -cp out ru.mirea.baranov.pr2.TestBall
