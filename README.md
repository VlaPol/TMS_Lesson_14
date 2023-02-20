Валютный калькулятор

🟢
– Создай проект в IDEA с базовым Hello world кодом.
– Создай gitignore файл.
– Сделай коммит в ветку main с сообщением “Initial commit“.
– Создай ветку feature-exchange.
– Выполняй задачи внутри этой feature ветки, можешь делать любые коммиты.

🟢
– Объяви enum класс Currency для денежных валют.
– Сделаем поддержку ограниченного числа валют: белорусский рубль, доллар США, евро, фунт стерлингов, российский рубль, китайский юань.
– В качестве идентификаторов элементов перечисления используй трёхбуквенный ISO 4217 код валюты – https://en.wikipedia.org/wiki/ISO_4217.
– Объяви строковое поле для названия валюты на русском языке.

🟢
– Объяви класс ExchangeRate для хранения курса одной валюты по отношению к базовой (в нашем случае по отношению к белорусскому рублю).
– На всякий случай отмечу, что нет отдельных курсов покупки и продажи по НБРБ. Там курс единый.
– Объяви поле для валюты.
– Объяви поле, которое отражает, сколько белорусских рублей в одной единице данной валюты.

🟡
– Объяви класс ExchangeService.
– Объяви метод getTodayRates. Он вернёт массив ExchangeRate с курсами всех валют на сегодня. Условно этот метод делает 
запрос в базу данных или в интернет сервис НБРБ и берёт данные оттуда. В нашем случае мы это просто имитируем. 
Прямо в коде задай создание этого массива с предопределёнными значениями. 
Возьми состояние курсов валют на произвольную дату отсюда – https://www.nbrb.by/statistics/rates/ratesdaily.asp.
– Объяви метод exchange, который принимает параметрами исходную валюту из существующих, денежную сумму в этой валюте и валюту, 
в которую мы эту сумму хотим перевести. Метод возвращает переведённую денежную сумму по курсу из getTodayRates.

🟢
– Объяви класс HomeWork14.
– Объяви статическую функцию main. Внутри функции создай объект ExchangeService и предложи пользователю 2 действия.
1) Вывод курсов валют на сегодня. Для каждой валюты выведи её название, код, курс к белорусскому рублю. 
2) Выведи в формате примерно как на прикреплённом скриншоте. Используй string.formatted(…) при выводе.
2) Калькулятор валют. Продемонстрируй метод exchange. Все параметры вводятся пользователем с консоли.

ℹ️
Можешь объявлять и использовать любые другие поля, методы, конструкторы, константы, если посчитаешь нужным.

🟢 Сделай Pull Request feature-exchange ветки в ветку main на GitHub.