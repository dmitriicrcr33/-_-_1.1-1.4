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