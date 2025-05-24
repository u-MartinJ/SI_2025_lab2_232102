# Втора лабораториска вежба по Софтверско инженерство

## Мартин Јованов, бр. на индекс 232102

### Control Flow Graph
![cfg](https://github.com/user-attachments/assets/2a7322ab-1545-4c70-980e-b2de98199779)

### Цикломатска комплексност

Цикломатска комплексност на овој код е 9, каде 1, 3, 5, 6.1, 7.1, 8, 10, 11 се предикатни јазли и според формулата P + 1 каде P е бројот на предикатни јазли.

### Тест случаи според критериумот Every statement

#### Невалиден лист 
Input: allItems = null
Expected: RuntimeException: "allItems list can't be null!"

#### Item со невалидно име
Input: List = [Item(null, 1, 10, 0)]
Expected: RuntimeException: "Invalid item!"

#### Невалиден број на картичка
Input: List = [Item("Bread", 1, 10, 0)], cardNumber = null
Expected: RuntimeException: "Invalid card number!"

#### Валиден Item 
Input: List = [Item("Bread", 1, 10, 0)], cardNumber = "1234567890123456"
Expected: RuntimeException: 10.0


### Тест случаи според критериумот Multiple Condition за if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)

Минимален број на тест случаии 2^3

| Test Case | A | B | C | Description |
| --------- | - | - | - | ----------- |
| TC1 | F | F | F | No condition true |
| TC2 | T | F | F | Only price > 300 |
| TC3 | F | T | F | Only discount > 0 |
| TC4 | F | F | T | Only quantity > 10 |
| TC5 | T | T | F | price > 300 and discount > 0 |
| TC6 | T | F | T | price > 300 and quantity > 10 |
| TC7 | F | T | T | quantity > 10 and discount > 0 |
| TC8 | T | T | T | All Condition True |



















