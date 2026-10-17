# Практика 3 — Абстрактные классы и интерфейсы

**Студент:** Баранов Дмитрий Максимович  
**Курс:** 3  
**Пакеты:** `ru.mirea.baranov.pr3.shapes`, `ru.mirea.baranov.pr3.movable`

## Цель

Освоить абстрактные классы, наследование, переопределение, полиморфизм, приведение типов и интерфейсы.

## Часть 1. Иерархия Shape

| Файл | Роль |
|---|---|
| `Shape.java` | Абстрактный класс: `color`, `filled`, `getArea()`, `getPerimeter()` |
| `Circle.java` | Радиус, площадь `πr²`, периметр `2πr` |
| `Rectangle.java` | Ширина и длина |
| `Square.java` | Наследник `Rectangle`, `setWidth`/`setLength` синхронизируют стороны |
| `TestShapes.java` | Массив `Shape[]` и downcast в `Square` |

### Ключевые моменты

- `Shape` нельзя инстанцировать — только через наследников.
- В `TestShapes` цикл по `Shape[]` вызывает версии методов конкретного класса.
- Downcast `(Square) shapes[2]` безопасен, т.к. элемент реально `Square`.

## Часть 2. Интерфейс Movable

| Файл | Роль |
|---|---|
| `Movable.java` | Интерфейс: `moveUp`, `moveDown`, `moveLeft`, `moveRight` |
| `MovablePoint.java` | Точка: `x`, `y`, `xSpeed`, `ySpeed` |
| `MovableCircle.java` | Круг, содержит `MovablePoint center` (агрегация) |
| `MovableRectangle.java` | Две точки, проверка равной скорости |
| `TestMovable.java` | Массив `Movable[]`, движение, проверка ошибки скоростей |

### Ключевые моменты

- `MovableRectangle` копирует точки и бросает `IllegalArgumentException` при разных скоростях.
- Методы движения в `MovableCircle` и `MovableRectangle` делегируют внутренним точкам.

## Запуск

```bash
javac -encoding UTF-8 -d out $(find src/ru/mirea/baranov/pr3 -name "*.java")
java -cp out ru.mirea.baranov.pr3.shapes.TestShapes
java -cp out ru.mirea.baranov.pr3.movable.TestMovable