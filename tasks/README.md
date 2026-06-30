# 27 задач на Java — від простого до складного

Практичні задачі для тренування Java/ООП. Розраховано на досвідченого розробника, що переходить з PHP/Laravel/Symfony на Java/Spring Boot.

Задачі впорядковані **за наростанням складності**: кожна наступна вводить приблизно одну нову велику тему, спираючись на попередні. Проходь по порядку — це і є навчальна крива. Прив'язку тем до теорії дивись у [`../ROADMAP.md`](../ROADMAP.md).

Кожна задача — окремий файл. Структура коду в ТЗ не дається навмисно: класи проектуєш сам (див. [`.claude/CLAUDE.md`](../.claude/CLAUDE.md)).

## Фаза A — основи: один клас, типи, контракти

- [1. Перевірка IBAN](01-iban.md) — String, BigInteger, статичні константи, приватні методи
- [2. Багаж із обмеженнями](02-suitcase.md) — інваріанти, власний виняток, defensive copy
- [3. Колода карт](03-deck.md) — enum з методами, record, Deque, вкладені цикли
- [4. Бібліотека книжок](04-library.md) — кілька Map, журнал подій, виняток
- [5. Багатовалютний гаманець](05-wallet.md) — BigDecimal, EnumMap, залежність через параметр
- [6. Семантична версія](06-semver-equals.md) — equals / hashCode / Comparable / Comparator

## Фаза B — інтерфейси, абстракції, поліморфізм

- [7. Зоопарк](07-zoo.md) — абстрактний клас, Template Method
- [8. Транспортний парк](08-fleet.md) — Template Method + поліморфна колекція
- [9. Геометричні фігури](09-shapes.md) — interface + record + Stream (базово)
- [10. Платіжна система](10-payment.md) — interface, Dependency Inversion, Strategy
- [11. Музичний плеєр](11-player.md) — interface, Queue, поліморфне споживання
- [12. Система сповіщень](12-notifications.md) — DI через конструктор, Open/Closed

## Фаза C — патерни та узагальнення (дженерики)

- [13. Система знижок](13-discounts.md) — Strategy + Composite
- [14. Логер з рівнями](14-logger.md) — default-методи, Composite + Decorator
- [15. Стратегія сортування](15-sort-strategy.md) — дженерики з обмеженнями + Strategy
- [16. Кеш із політикою витіснення](16-cache.md) — Template Method + дженерики на 2 параметри + LRU
- [17. Кільцевий буфер](17-ring-buffer-iterable.md) — дженерики + власний Iterable / Iterator

## Фаза D — стандартна бібліотека: стріми, I/O, regex, час

- [18. Аналітика продажів](18-sales-analytics-streams.md) — Stream API вглиб + лямбди
- [19. Парсер та валідатор](19-log-parser-regex.md) — regex (Pattern / Matcher)
- [20. Планувальник зустрічей](20-meeting-scheduler-time.md) — java.time (Duration / Period)
- [21. Аналізатор логів](21-log-analyzer-io.md) — I/O: термінал + файли, try-with-resources

## Фаза E — сучасна Java та великий домен

- [22. Події замовлення](22-order-events-sealed.md) — sealed + pattern matching
- [23. Замовлення у ресторані](23-restaurant-order.md) — велика композиція, переходи станів
- [24. Симуляція автостоянки](24-parking-lot.md) — композиція + Optional + Strategy
- [25. Банкомат із станами](25-atm-state.md) — State pattern
- [26. Парсер арифметичних виразів](26-expression-parser.md) — Composite + рекурсія
- [27. Шахи (рух фігур)](27-chess.md) — велика поліморфна ієрархія (магнум опус)

## Фаза F — патерни проектування (Gang of Four)

Непокриті фазами A–E класичні патерни. (Strategy, Composite, Decorator, Template Method, State, Iterator вже відпрацьовані раніше.)

*Породжувальні:*
- [28. Реєстр конфігурації](28-singleton.md) — Singleton (+ чому це часто анти-патерн)
- [29. Конструктор HTTP-запиту](29-builder.md) — Builder
- [30. Логістика](30-factory-method.md) — Factory Method
- [31. UI-набір під тему](31-abstract-factory.md) — Abstract Factory
- [39. Прототипи обʼєктів сцени](39-prototype.md) — Prototype (shallow vs deep copy)

*Структурні:*
- [32. Адаптер стороннього сервісу](32-adapter.md) — Adapter
- [33. Фасад оформлення замовлення](33-facade.md) — Facade
- [34. Кешуючий проксі сервісу](34-proxy.md) — Proxy

*Поведінкові:*
- [35. Котирування акцій](35-observer.md) — Observer
- [36. Текстовий редактор з undo](36-command.md) — Command
- [37. Конвеєр middleware](37-chain-of-responsibility.md) — Chain of Responsibility
- [38. Знімки стану документа](38-memento.md) — Memento
- [40. Чат-кімната](40-mediator.md) — Mediator
- [41. Відвідувач дерева фігур](41-visitor.md) — Visitor (expression problem)

---

## Як працювати зі списком

1. **Порядок = складність.** Іди зверху вниз. Не перестрибуй фази: кожна спирається на попередню (наприклад, дженерики у фазі C треба для стрімів і колекцій далі).

2. **Структура проекту.** Один клас задач — окремий пакет, наприклад `com.example.tasks.task01iban`. Не валити все в одну купу.

3. **На кожне завдання:**
   - Спроєктувати класи самостійно (у ТЗ структури немає навмисно).
   - 3–5 unit-тестів JUnit 5 (мінімум — happy path, краєвий випадок, виняток).
   - Невеликий демонстраційний запуск для ручної перевірки.

4. **Якщо застряг** більше 3 годин — звернутись по підказку, але не питати готовий код. Сказати, на якому місці затик, що пробував, що не працює. Підказка має бути про напрямок, не рішення.

5. **Коміт у GitHub** — окремий репозиторій `java-practice` з README й галочками виконаних.

---

## Чек-лист виконаних

### Фаза A
- [ ] [1. Перевірка IBAN](01-iban.md)
- [ ] [2. Багаж із обмеженнями](02-suitcase.md)
- [ ] [3. Колода карт](03-deck.md)
- [ ] [4. Бібліотека книжок](04-library.md)
- [ ] [5. Багатовалютний гаманець](05-wallet.md)
- [ ] [6. Семантична версія](06-semver-equals.md)

### Фаза B
- [ ] [7. Зоопарк](07-zoo.md)
- [ ] [8. Транспортний парк](08-fleet.md)
- [ ] [9. Геометричні фігури](09-shapes.md)
- [ ] [10. Платіжна система](10-payment.md)
- [ ] [11. Музичний плеєр](11-player.md)
- [ ] [12. Система сповіщень](12-notifications.md)

### Фаза C
- [ ] [13. Система знижок](13-discounts.md)
- [ ] [14. Логер з рівнями](14-logger.md)
- [ ] [15. Стратегія сортування](15-sort-strategy.md)
- [ ] [16. Кеш із політикою витіснення](16-cache.md)
- [ ] [17. Кільцевий буфер](17-ring-buffer-iterable.md)

### Фаза D
- [ ] [18. Аналітика продажів](18-sales-analytics-streams.md)
- [ ] [19. Парсер та валідатор (regex)](19-log-parser-regex.md)
- [ ] [20. Планувальник зустрічей](20-meeting-scheduler-time.md)
- [ ] [21. Аналізатор логів (I/O)](21-log-analyzer-io.md)

### Фаза E
- [ ] [22. Події замовлення (sealed)](22-order-events-sealed.md)
- [ ] [23. Замовлення у ресторані](23-restaurant-order.md)
- [ ] [24. Симуляція автостоянки](24-parking-lot.md)
- [ ] [25. Банкомат із станами](25-atm-state.md)
- [ ] [26. Парсер арифметичних виразів](26-expression-parser.md)
- [ ] [27. Шахи (рух фігур)](27-chess.md)

### Фаза F — патерни GoF
- [ ] [28. Singleton — реєстр конфігурації](28-singleton.md)
- [ ] [29. Builder — конструктор HTTP-запиту](29-builder.md)
- [ ] [30. Factory Method — логістика](30-factory-method.md)
- [ ] [31. Abstract Factory — UI-набір під тему](31-abstract-factory.md)
- [ ] [32. Adapter — сторонній сервіс](32-adapter.md)
- [ ] [33. Facade — оформлення замовлення](33-facade.md)
- [ ] [34. Proxy — кешуючий проксі](34-proxy.md)
- [ ] [35. Observer — котирування акцій](35-observer.md)
- [ ] [36. Command — редактор з undo](36-command.md)
- [ ] [37. Chain of Responsibility — middleware](37-chain-of-responsibility.md)
- [ ] [38. Memento — знімки стану](38-memento.md)
- [ ] [39. Prototype — клонування фігур](39-prototype.md)
- [ ] [40. Mediator — чат-кімната](40-mediator.md)
- [ ] [41. Visitor — відвідувач фігур](41-visitor.md)
